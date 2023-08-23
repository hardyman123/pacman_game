package pacman;

import javafx.scene.layout.Pane;

public class FreeSpace implements Collideable{

    private Pane _pane;

    public FreeSpace(){
        
    }

    @Override
    public Pane getRoot() {
        return _pane;
    }

    @Override
    public void makeShape(int x, int y, Pane pane) {
        _pane = pane;
    }
    
}
