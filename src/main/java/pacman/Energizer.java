package pacman;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Energizer implements Collideable {

    private Pane _pane;
    private Color _fill;
    private Circle _circle;

    public Energizer(){
        _fill = Color.LIGHTCORAL;
    }

    @Override
    public Pane getRoot() {
        return _pane;
    }

    @Override
    public void makeShape(int x, int y, Pane pane) {

        _pane = pane;
        _circle = new Circle(x*24+12, y*24+12, 5, _fill); // switch order for visuals <-- NOT
        _pane.getChildren().add(_circle);

    }
    
}
