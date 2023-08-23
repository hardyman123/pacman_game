package pacman;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SmartSquare {

    Rectangle _square;
    Collideable _object;
    Pane _pane;
    int xCoordinate;
    int yCoordinate;

    public SmartSquare(int x, int y, Collideable obj){
        xCoordinate = x;
        yCoordinate = y;
        _object = obj;

        _square = new Rectangle(x*24, y*24, 24, 24); // NVM!! Every object is a collideable that 
        // implements the interface and requires it to visually fill itself out.

        _pane = new Pane();
        
        _object.makeShape(x, y, _pane); // SWITCHED THE X/Y's so it looks right <-- not rn
    }

    public Collideable getObject(){
        return  _object;
    }

    public void setObject(Collideable obj){
        _object = obj;
    }


    public Pane getRoot(){
        return _pane;
    }



    





    
}
