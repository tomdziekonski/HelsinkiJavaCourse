package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        Label FirstSceneUserInstruction = new Label("Enter your name and start.");
        TextField FirstSceneTextField = new TextField();
        Button FirstSceneStartButton = new Button("Start");
        StackPane layout = new StackPane();
       
        VBox hbox = new VBox();

        hbox.getChildren().add(FirstSceneUserInstruction);
        hbox.getChildren().add(FirstSceneTextField);
        hbox.getChildren().add(FirstSceneStartButton);

        layout.getChildren().add(hbox);

        FirstSceneStartButton.setOnAction((event) -> {
            String greeting = FirstSceneTextField.getText();
            Label greetings = new Label("Welcome " + greeting + "!");
            Scene second = new Scene(greetings);

            window.setScene(second);
        });

        Scene first = new Scene(layout);

        window.setScene(first);
        window.show();
    }
}
