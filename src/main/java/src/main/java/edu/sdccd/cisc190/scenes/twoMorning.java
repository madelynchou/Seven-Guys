/* package edu.sdccd.cisc190.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class twoMorning {
    private Scene scene;
    private int conviction = 0;   // Variable to track the conviction stat
    private int madness = 0;      // Variable to track the madness stat
    private Text gameStatus;
    private Text statsText;       // Text to display the stats

    // Declare buttons as instance variables to use them in different methods
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button continueButton;

    public twoMorning(Stage primaryStage) {
        // Initial game status text
        gameStatus = new Text("All that excitement, and you’re still bored. " +
                "Back again scrolling through your phone, bored out of your mind, totally doing your job. " +
                "After the hour’s… quirky encounters? You’re pretty good. Did you have a choice? " +
                "No. Ironic, a game like this doesn’t give you the cho- anyways. " +
                "The manager of the place shoved a big old note right on the SCAM.\n" +
                "\n" +
                "“Hello? Hello? I’m writing this like I’m speaking to you over the phone. " +
                "Imma need you to clean the bathrooms…” You panic over reading that part, " +
                "“Yes. Both of them. So good luck.” " +
                "Good luck? GOOD LUCK? WHAT. No way, does that imply… whatever. " +
                "Finishing the note, “note: if you don’t do this, I’ll terminate you.” " +
                "You don’t know what to say to that. So you’ll have to take care of that eventually.\n");
        gameStatus.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        // Text for displaying stats (conviction and madness)
        statsText = new Text("Conviction: " + conviction + " | Madness: " + madness);
        statsText.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        // Initialize buttons
        oneButton = new Button("Actually do your job");
        twoButton = new Button("Procrastinating is nice...");
        continueButton = new Button("Transition to 1 AM");

        // Set styles for the buttons
        oneButton.setStyle("-fx-font-size: 14px;");
        twoButton.setStyle("-fx-font-size: 14px;");
        continueButton.setStyle("-fx-font-size: 14px;");

        // Set the continue button to be initially invisible
        continueButton.setVisible(false);

        // Button actions
        oneButton.setOnAction(e -> {
            gameStatus.setText("You’ve decided to check the cameras, from the nearby halls to adjacent rooms from the main stage.\n" +
                    "You find no trace of the missing animatronic, but you were more worried about how the management would react hearing about one of their mascots just disappearing.");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            continueButton.setVisible(true);
            hideOtherButtons();
        });

        twoButton.setOnAction(e -> {
            gameStatus.setText("Whatever! The pay wasn’t good in the first place! Besides, you got more important things to do, such as getting that victory in Brawl Stars!\n" +
                    "You got up from your chair and cheered, but it was a short victory as you noticed the animatronic right behind you. *SLASH*");
            updateStats();  // Update the stats text

            // Show the continue button and hide other buttons
            continueButton.setVisible(true);
            hideOtherButtons();
        });

        // Action for continueButton to change to next scene
        continueButton.setOnAction(e -> primaryStage.setScene(new twoMorning(primaryStage).getScene()));

        // Create the BorderPane layout
        BorderPane layout = new BorderPane();

        // Add game status text to the top
        layout.setTop(gameStatus);

        // Add stats text below the game status text
        layout.setBottom(statsText);

        // Add buttons to the layout
        BorderPane.setAlignment(oneButton, javafx.geometry.Pos.CENTER);
        BorderPane.setAlignment(twoButton, javafx.geometry.Pos.CENTER);
        BorderPane.setAlignment(continueButton, javafx.geometry.Pos.CENTER);

        layout.setLeft(oneButton);
        layout.setRight(twoButton);
        layout.setCenter(continueButton);

        // Scene creation with appropriate size
        scene = new Scene(layout, 400, 400);  // Adjusted width for better appearance
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

    // Getter for the scene
    public Scene getScene() {
        return scene;
    }
} */