package edu.sdccd.cisc190.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class fiveMorning {
    private Scene scene;
    private int conviction; // Variable to track the conviction stat
    private int madness; // Variable to track the madness stat
    private final Text gameStatus;
    private final Text statsText;       // Text to display the stats

    // Declare buttons as instance variables to use them in different methods
    private final Button oneButton;
    private final Button twoButton;
    private final Button threeButton;
    private final Button fourButton;
    private final Button fiveButton;
    private final Button sixButton;
    private final Button sevenButton;
    private final Button eightButton;
    private final Button nineButton;
    private final Button continueButton;

    public fiveMorning(Stage primaryStage) {
        // Initial game status text
        gameStatus = new Text("");
        gameStatus.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        // Text for displaying stats (conviction and madness)
        statsText = new Text("Conviction: " + conviction + " | Madness: " + madness);
        statsText.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        // Initialize buttons
        oneButton = new Button("");
        twoButton = new Button("");
        threeButton = new Button("");
        fourButton = new Button("");
        fiveButton = new Button("");
        sixButton = new Button("");
        sevenButton = new Button("");
        eightButton = new Button("");
        nineButton = new Button("");
        continueButton = new Button("Transition to 6 AM");

        // Set styles for the buttons
        oneButton.setStyle("-fx-font-size: 14px;");
        twoButton.setStyle("-fx-font-size: 14px;");
        threeButton.setStyle("-fx-font-size: 14px;");
        fourButton.setStyle("-fx-font-size: 14px;");
        fiveButton.setStyle("-fx-font-size: 14px;");
        sixButton.setStyle("-fx-font-size: 14px;");
        sevenButton.setStyle("-fx-font-size: 14px;");
        eightButton.setStyle("-fx-font-size: 14px;");
        nineButton.setStyle("-fx-font-size: 14px;");
        continueButton.setStyle("-fx-font-size: 14px;");

        // Set the continue button to be initially invisible
        threeButton.setVisible(false);
        fourButton.setVisible(false);
        fiveButton.setVisible(false);
        sixButton.setVisible(false);
        sevenButton.setVisible(false);
        eightButton.setVisible(false);
        nineButton.setVisible(false);
        continueButton.setVisible(false);

        // Button actions
        oneButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            threeButton.setVisible(true);
            fourButton.setVisible(true);
            fiveButton.setVisible(true);
            hideOtherButtons();
        });

        twoButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            eightButton.setVisible(true);
            nineButton.setVisible(true);
            hideOtherButtons();
        });

        threeButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            sixButton.setVisible(true);
            sevenButton.setVisible(true);
            hideMoreButtons();
        });

        fourButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            sixButton.setVisible(true);
            sevenButton.setVisible(true);
            hideMoreButtons();
        });

        fiveButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            sixButton.setVisible(true);
            sevenButton.setVisible(true);
            hideMoreButtons();
        });

        sixButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            continueButton.setVisible(true);
            hideEvenMoreButtons();
        });

        sevenButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            continueButton.setVisible(true);
            hideEvenMoreButtons();
        });

        eightButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            continueButton.setVisible(true);
            hideMoreButtons();
        });

        nineButton.setOnAction(e -> {
            gameStatus.setText("");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            continueButton.setVisible(true);
            hideMoreButtons();
        });

        // Action for continueButton to change to next scene
        continueButton.setOnAction(e -> primaryStage.setScene(new fiveMorning(primaryStage).getScene()));

        // Create the BorderPane layout
        BorderPane layout = new BorderPane();

        // Add game status text to the top
        layout.setTop(gameStatus);

        // Add stats text below the game status text
        layout.setBottom(statsText);

        // Create a VBox to arrange buttons vertically
        VBox buttonBox = new VBox(10);  // 10px spacing between buttons
        buttonBox.getChildren().addAll(oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, continueButton);

        // Set the VBox containing buttons to the center of the BorderPane
        layout.setCenter(buttonBox);

        // Scene creation with appropriate size
        scene = new Scene(layout, 400, 400);
    }

    // Method to update the stats text
    private void updateStats() {
        statsText.setText("Conviction: " + conviction + " | Madness: " + madness);
    }

    // Helper method to hide the action buttons
    private void hideOtherButtons() {
        oneButton.setVisible(false);
        twoButton.setVisible(false);
    }

    private void hideMoreButtons() {
        threeButton.setVisible(false);
        fourButton.setVisible(false);
        fiveButton.setVisible(false);
        eightButton.setVisible(false);
        nineButton.setVisible(false);

    }

    private void hideEvenMoreButtons() {
        sixButton.setVisible(false);
        sevenButton.setVisible(false);
    }

    // Getter for the scene
    public Scene getScene() {
        return scene;
    }
}
