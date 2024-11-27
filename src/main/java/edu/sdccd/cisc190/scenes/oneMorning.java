package edu.sdccd.cisc190.scenes;

import edu.sdccd.cisc190.generalstuff.MainMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class oneMorning {
    private Scene scene;

    public oneMorning(Stage primaryStage) {
        // Creating the initial game status text with a larger font size for readability
        Text gameStatus = new Text("All that excitement, and you’re still bored.\n" +
                "Back again scrolling through your phone, bored out of your mind, totally doing your job.\n" +
                "After the hour’s… quirky encounters? You’re pretty good. Did you have a choice?\n" +
                "No. Ironic, a game like this doesn’t give you the cho- anyways.\n" +
                "The manager of the place shoved a big olde note right on the SCAM.\n" +
                "“Hello? Hello? I’m writing this like I’m speaking to you over the phone. Imma need you to clean the bathrooms…”\n" +
                "You panic over reading that part, “Yes. Both of them. So good luck.\n”" +
                "Good luck? GOOD LUCK? WHAT. No way, does that imply… whatever.\n" +
                "Finishing the note, “note: if you don’t do this, I’ll terminate you.” You don’t know what to say to that.\n" +
                "So you’ll have to take care of that eventually.\n");
        gameStatus.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");  // Increased font size

        // Button for checking cameras
        Button oneButton = new Button("Actually do your job");
        oneButton.setStyle("-fx-font-size: 14px;");
        oneButton.setOnAction(e -> gameStatus.setText(""));
        oneButton.setOnAction(e -> primaryStage.setScene(new MainMenu(primaryStage).getScene()));

        // Button for ignoring the situation
        Button twoButton = new Button("Procrastinating is nice...");
        twoButton.setStyle("-fx-font-size: 14px;");
        twoButton.setOnAction(e -> gameStatus.setText(""));
        twoButton.setOnAction(e -> primaryStage.setScene(new twelveMorning(primaryStage).getScene()));

        // Layout with spacing between elements
        VBox layout = new VBox(10);  // Set vertical spacing of 10 pixels between elements
        layout.getChildren().addAll(gameStatus, oneButton, twoButton);  // Adding all the elements to the layout

        // Scene creation with appropriate size
        scene = new Scene(layout, 400, 400);  // Adjusted width for better appearance
    }

    public Scene getScene() {
        return scene;
    }
}
