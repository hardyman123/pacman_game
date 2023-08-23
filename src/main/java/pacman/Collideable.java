package pacman;

import javafx.scene.layout.Pane;

public interface Collideable {
    public Pane getRoot();

    public void makeShape(int x, int y, Pane pane);
}
