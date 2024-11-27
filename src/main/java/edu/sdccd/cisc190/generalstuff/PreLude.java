package edu.sdccd.cisc190.generalstuff;

import edu.sdccd.cisc190.scenes.twelveMorning;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PreLude {
    private Scene scene;

    public PreLude(Stage primaryStage) {
        // Create the game status text
        Text gameStatus = new Text("What was that? Did the stat points that should be appearing on a “screen” increase. " +
                "Apparently, everything you do is judge. Of Judgey devs. Huh what did we do-.\n" +
                "“Whatever, I can do this” you say anxiously of the sanity meter that is also there.\n" +
                "“But we'll probably avoid getting that meter down to 0. Just a thought”\n" +
                "(We won’t tell the nightguard this but, you’ll die. Don’t do dumb sounding stuff and you won’t die. " +
                "I mean unless you want to :p)\nHere you are, sitting in your new office. " +
                "There’s the door to the main stage on your left, a table filled with monitors of the different cameras around the restaurant, " +
                "a fan on top that barely works, and of course, a flashlight and a badge on your moldy chair " +
                "that you’re sure hasn’t been cleaned in weeks… you have a bad feeling about this. How… cliche.\n");
        gameStatus.setStyle("-fx-font-size: 10px; -fx-font-weight: bold;");

        // Create the action button
        Button actionButton = new Button("Feeling a little 12AM?");
        actionButton.setStyle("-fx-font-size: 14px;");
        actionButton.setOnAction(e -> primaryStage.setScene(new twelveMorning(primaryStage).getScene()));

        // Set up the BorderPane layout
        BorderPane layout = new BorderPane();

        // Add the gameStatus text to the center of the BorderPane
        layout.setTop(gameStatus);

        // Add the actionButton to the bottom of the BorderPane
        layout.setCenter(actionButton);

        // Create the scene with the layout and set the preferred size
        scene = new Scene(layout, 300, 400);
    }

    // Getter for the scene
    public Scene getScene() {
        return scene;
    }
}
