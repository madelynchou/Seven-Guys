package edu.sdccd.cisc190.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class sixMorning {
    private final Scene scene;
    private int conviction;  // Variable to track the conviction stat
    private int madness;     // Variable to track the madness stat
    private final Text gameStatus;
    private final Text statsText;
    private final Button continueButton;

    public sixMorning(Stage primaryStage, int conviction, int madness) {
        this.conviction = conviction;  // Receive conviction from previous scene
        this.madness = madness;        // Receive madness from previous scene

        // Initial game status text
        gameStatus = new Text("You wake up at 6 AM with your conviction at " + conviction + " and your madness at " + madness + ".\n");
        gameStatus.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        statsText = new Text("Conviction: " + conviction + " | Madness: " + madness);
        statsText.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        continueButton = new Button("Transition to 1 AM");
        continueButton.setStyle("-fx-font-size: 14px;");
        continueButton.setOnAction(e -> primaryStage.setScene(new oneMorning(primaryStage).getScene()));

        BorderPane layout = new BorderPane();
        layout.setTop(gameStatus);
        layout.setBottom(statsText);
        BorderPane.setAlignment(continueButton, javafx.geometry.Pos.CENTER);
        layout.setCenter(continueButton);

        scene = new Scene(layout, 400, 400);
    }

    public sixMorning(Stage primaryStage, Scene scene, Text gameStatus, Text statsText, Button continueButton) {
        this.scene = scene;
        this.gameStatus = gameStatus;
        this.statsText = statsText;
        this.continueButton = continueButton;
    }

    public Scene getScene() {
        return scene;
    }
}
