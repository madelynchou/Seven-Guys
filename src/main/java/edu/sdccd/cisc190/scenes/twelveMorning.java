package edu.sdccd.cisc190.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class twelveMorning {
    private Scene scene;

    public twelveMorning(Stage primaryStage) {
        // Creating the initial game status text with a larger font size for readability
        Text gameStatus = new Text("You've been sitting in your office, playing Brawl Stars, " +
                "ignoring any work because there’s nothing to do besides staring at the ceiling, " +
                "lights on and off, and looking at the animatronics on the SCAM.\nThe clock struck midnight." +
                "\nIn the background, the SCAM flashes statics.\nThat’s important, probably.\n" +
                "Looking closer, your eyes opened wide realizing the stage was missing a person.\n" +
                "Wait... is one of them gone?\nLooking closer, you noticed Chica was gone.\n" +
                "Weird, what should you do?");
        gameStatus.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");  // Increased font size

        // Button for checking cameras
        Button oneButton = new Button("Check the cameras (+1 conviction)");
        oneButton.setStyle("-fx-font-size: 14px;");
        oneButton.setOnAction(e -> gameStatus.setText("You’ve decided to check the cameras, " +
                "from the nearby halls to adjacent rooms from the main stage.\n" +
                "You find no trace of the missing animatronic, " +
                "starting to feel quite worried about how it disappeared, " +
                "but you were more worried about how the management would react hearing about one of their mascots " +
                "just disappearing with just a single shift with you.\nYou feel the looming dread of corporate lawsuits."));
        oneButton.setOnAction(e -> primaryStage.setScene(new oneMorning(primaryStage).getScene()));

        // Button for ignoring the situation
        Button twoButton = new Button("Ignorance is bliss (+1 conviction, +1 madness)");
        twoButton.setStyle("-fx-font-size: 14px;");
        twoButton.setOnAction(e -> gameStatus.setText("Whatever! The pay wasn’t good in the first place!\n" +
                "Besides, you got more important things to do, such as getting that victory in Brawl Stars!\n" +
                "Alright, get that power cube, dodge the bullets, shoot the enemy, and bam! You won!\n" +
                "You got up from your chair and cheered, but it was a short victory as you noticed the animatronic right behind you. *SLASH*\n"));
        twoButton.setOnAction(e -> primaryStage.setScene(new oneMorning(primaryStage).getScene()));

        Button threeButton = new Button("This place is crazy, leave");
        threeButton.setStyle("-fx-font-size: 14px;");
        threeButton.setOnAction(e -> gameStatus.setText("This place is nuts!\n" +
                "No way you’re going to deal with something like this on a late evening, let alone on the FIRST HOUR.\n" +
                "You prepare to ditch this job without a single care of what will happen next, you exit the office, and then the building.\n" +
                "You were decent enough to lock down the building but not enough to not chuck the keys to god-knows where.\n" +
                "You leave, pissed out of shits, you decide it's better to celebrate Christmas earlier than this.\n"));
        threeButton.setOnAction(e -> primaryStage.setScene(new oneMorning(primaryStage).getScene()));

        // Layout with spacing between elements
        VBox layout = new VBox(10);  // Set vertical spacing of 10 pixels between elements
        layout.getChildren().addAll(gameStatus, oneButton, twoButton, threeButton);  // Adding all the elements to the layout

        // Scene creation with appropriate size
        scene = new Scene(layout, 400, 400);  // Adjusted width for better appearance
    }

    public Scene getScene() {
        return scene;
    }
}
