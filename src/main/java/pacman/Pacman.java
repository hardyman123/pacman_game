package pacman;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Pacman implements Collideable, Moveable {
    
    private Pane _pane;
    private Color _fill;
    private Circle _thepac;
    private int _xLoc;
    private int _yLoc;
    private int _xDirection;
    private int _yDirection;
    private boolean[][] _wallArray;
    private SmartSquare[][] _smartSquareArray;



    public Pacman(){
        _fill = Color.YELLOW;
        _xDirection = 0;
        _yDirection = 0;
    }

    public void setupSSArray(SmartSquare[][] ss){
        _smartSquareArray = ss;
    }

    public void setupWalls(boolean[][] walls){
        _wallArray = walls;
    }

    @Override
    public Pane getRoot() {
        return _pane;
    }

    @Override
    public void makeShape(int x, int y, Pane pane) {
        _xLoc = (x*24)+12;
        _yLoc = (y*24)+12;
        _pane = pane;
        _thepac = new Circle(_xLoc, _yLoc, 9, _fill);//switch order for visuals
        _pane.getChildren().add(_thepac);
    }

    public int getXLocation(){
        return (_xLoc-12)/24;
    }
    
    public int getYLocation(){
        return (_yLoc-12)/24;
    }

    public void setXLocation(int x){
        _xLoc = x;
    }
    
    public void setYLocation(int y){
        _yLoc = y;
    }

    
    public void changeX(int offset){
        //setXLocation((getXLocation()+offset));
        int newX = _xLoc+(offset*24);
        _thepac.setCenterX(newX);
        setXLocation(newX);
        
    }

    public void changeY(int offset){
        //etYLocation((getYLocation()+offset));
        int newY = _yLoc+(offset*24);
        _thepac.setCenterY(newY);
        setYLocation(newY);
    }

    @Override
    public void moveUp() {
        changeY(-1);
    }

    @Override
    public void moveDown() {
        changeY(1);
    }

    @Override
    public void moveLeft() {
        changeX(-1);
    }

    @Override
    public void moveRight() {
        changeX(1);
    }



    public boolean canMove(int xDir, int yDir){
        System.out.println("we are located at ["+getXLocation()+"]["+getYLocation()+"]");
        if(_wallArray[getXLocation()+xDir][getYLocation()+yDir]==true){
            System.out.println("there is a wall at ["+(getXLocation()+xDir)+"]["+(getYLocation()+yDir)+"]");
            return true;
        } else{ 
            System.out.println("there is no wall at ["+(getXLocation()+xDir)+"]["+(getYLocation()+yDir)+"]");
            return false;
        }

    }


    
}
