package pacman;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Wall implements Collideable {

    private Pane _pane;
    private Color _fill;
    private Rectangle _rectangle;



    public Wall(){
        _fill = Color.BLUE;
    }

    @Override
    public Pane getRoot() {
        return _pane;
    }

    @Override
    public void makeShape(int x, int y, Pane pane) {
        _pane = pane;
        _rectangle = new Rectangle(x*24, y*24, 24, 24);//switch order for visuals <-- NOT
        _rectangle.setFill(_fill);
        _pane.getChildren().add(_rectangle);
    }

    
    
}
