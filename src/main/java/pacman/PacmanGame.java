package pacman;

import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
//import javax.swing.Timer;
//mport java.awt.event.ActionListener;
import java.util.Timer;

public class PacmanGame {

    private Pane _myPane;

    private SmartSquare[][] _board;
    private BSqr[][] _supportMap;
    private int _pacX;
    private int _pacY;
    private Pacman _pacman;
    private boolean[][] _wallArray;
    private KeyHandler _keyHandler;



    public PacmanGame(){

        _myPane = new Pane();
        _supportMap = SupportMap.getSupportMap();
        _board = new SmartSquare[23][23];
        _wallArray = new boolean[23][23]; // walls are represented as FALSE, free spaces as TRUE
        setupBoard();
        

        _keyHandler = new KeyHandler();
        _myPane.addEventHandler(KeyEvent.KEY_PRESSED, _keyHandler);
        _myPane.setFocusTraversable(true);


    }

    public void setupBoard(){
        for(int row=0; row<23; row++){
            for(int col=0; col<23; col++){
                System.out.println("we're on row: "+row+" and column "+col);
                if(_supportMap[row][col]==BSqr.WALL){
                    _board[row][col] = new SmartSquare(row, col, new Wall());
                    _wallArray[row][col] = false;
                    System.out.println("there is a wall at ["+col+"]["+row+"]");
                    _myPane.getChildren().add(_board[row][col].getRoot());
                } else if(_supportMap[row][col]==BSqr.DOT){
                    _wallArray[row][col] = true;
                    _board[row][col] = new SmartSquare(row, col, new Dot());
                    _myPane.getChildren().add(_board[row][col].getRoot());
                } else if(_supportMap[row][col]==BSqr.ENERGIZER){
                    _wallArray[row][col] = true;
                    _board[row][col] = new SmartSquare(row, col, new Energizer());
                    _myPane.getChildren().add(_board[row][col].getRoot());
                } else if(_supportMap[row][col]==BSqr.PACMAN_START){
                    _wallArray[row][col] = true;
                    _pacman = new Pacman();
                    _pacX = row;
                    _pacY = col;
                    _board[row][col] = new SmartSquare(row, col,_pacman);
                    System.out.println("Pacman is at ["+row+"]["+col+"]");
                }
                // IMPLEMENT THE GHOSTS
                else {
                    _wallArray[row][col] = true;
                    _board[row][col] = new SmartSquare(row, col, new FreeSpace());
                }
                
            }
        }
        _myPane.getChildren().add(_pacman.getRoot());
        _pacman.setupWalls(_wallArray);
        _pacman.setupSSArray(_board);
    }




    public Pane getRoot(){
        return _myPane;
    }




    private class KeyHandler implements EventHandler<KeyEvent> {
        @Override
        public void handle(KeyEvent e) {
            KeyCode keyPressed = e.getCode();
            switch(keyPressed){
                default:
                    break;
                case UP:
                    if(_pacman.canMove(0, -1)){
                        _pacman.moveUp();
                    }
                    break;
                case DOWN:
                    if(_pacman.canMove(0, 1)){
                        _pacman.moveDown();
                    }
                    break;
                case LEFT:
                    if(_pacman.canMove(-1, 0)){
                        _pacman.moveLeft();
                    }
                    break;
                case RIGHT:
                    if(_pacman.canMove(1, 0)){
                        _pacman.moveRight();
                    }
                    break;
            }
        }
    }
    
}
