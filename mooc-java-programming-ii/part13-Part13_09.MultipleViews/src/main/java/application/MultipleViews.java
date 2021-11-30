package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label text = new Label("First View!");
        Label textTwo = new Label("Second view!");
        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        GridPane pane = new GridPane();
        Label textThree = new Label("Third view");
        Button thirdButton = new Button("To the first view!");
        VBox vertical = new VBox();

        layout.setTop(text);
        layout.setCenter(firstButton);
        Scene windowContent = new Scene(layout);

        vertical.getChildren().add(secondButton);
        vertical.getChildren().add(textTwo);

        Scene windowContentSecond = new Scene(vertical);

        pane.add(textThree, 0, 0);
        pane.add(thirdButton, 1, 1);
        Scene windowContentThird = new Scene(pane);

        firstButton.setOnAction((value) -> {
            window.setScene(windowContentSecond);
        });

        secondButton.setOnAction((value) -> {
            window.setScene(windowContentThird);
        });

        thirdButton.setOnAction((value) -> {
            window.setScene(windowContent);
        });

        window.setScene(windowContent);
        window.show();
    }
}
