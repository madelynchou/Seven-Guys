package edu.sdccd.cisc190;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGame extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create scenes for each part of the game
        TitleScreen titleScreen = new TitleScreen(primaryStage);
        MainMenu mainMenu = new MainMenu(primaryStage);
        PreLude gameScreen = new PreLude(primaryStage);

        // Set the title screen as the initial scene
        primaryStage.setTitle("NightShift at Seven Guys");
        primaryStage.setScene(titleScreen.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
