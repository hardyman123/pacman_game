package pacman;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Dot implements Collideable {

    private Pane _pane;
    private Color _fill;
    private Circle _circle;

    public Dot(){

        _fill = Color.RED;
        
    }

    @Override
    public Pane getRoot() {
        return _pane;
    }

    @Override
    public void makeShape(int x, int y, Pane pane) {

        _pane = pane;
        _circle = new Circle(x*24+12, y*24+12, 2, _fill);//switch order for visuals <-- NOT
        _pane.getChildren().add(_circle);

    }
    
}
