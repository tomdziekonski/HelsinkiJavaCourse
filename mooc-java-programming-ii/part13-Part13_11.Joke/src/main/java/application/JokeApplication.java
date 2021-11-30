package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        Button JokeButton = new Button("Joke");
        Button AnswerButton = new Button("Answer");
        Button ExplanationButton = new Button("Explanation");
        VBox vbox = new VBox();
        Label JokeResult = new Label("What do you call a bear with no teeth?");

        vbox.getChildren().add(JokeButton);
        vbox.getChildren().add(AnswerButton);
        vbox.getChildren().add(ExplanationButton);
        vbox.getChildren().add(JokeResult);

        Scene WindowContent = new Scene(vbox);

        JokeButton.setOnAction((value) -> {
            JokeResult.setText("What do you call a bear with no teeth?");
        });

        AnswerButton.setOnAction((value) -> {
            JokeResult.setText("A gummy bear.");
        });

        ExplanationButton.setOnAction((value) -> {
            JokeResult.setText("I don't have an explanation. Sorry.");
        });

        window.setScene(WindowContent);
        window.show();
    }
}
