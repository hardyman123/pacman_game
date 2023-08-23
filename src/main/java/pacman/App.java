package pacman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Pacman");
        
        PaneOrganizer organizer = new PaneOrganizer();
        
        Scene scene = new Scene(organizer.getRoot(), 23*24, 23*24); //23 square by 24 pixels

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}