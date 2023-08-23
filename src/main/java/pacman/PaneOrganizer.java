package pacman;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
    private BorderPane _bp;

    public PaneOrganizer(){
        _bp = new BorderPane();
        PacmanGame game = new PacmanGame();

        _bp.setStyle("-fx-background-color:black");
        _bp.setCenter(game.getRoot());
    }


    public Pane getRoot(){
        return _bp;
    }
}
