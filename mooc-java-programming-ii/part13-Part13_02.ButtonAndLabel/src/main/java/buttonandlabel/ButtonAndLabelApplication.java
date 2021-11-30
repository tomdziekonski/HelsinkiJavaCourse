package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch();
    }

    @Override
    public void start(Stage window) {
        Label text = new Label("Text message");
        FlowPane pane = new FlowPane();
        Button button = new Button("Click me");
        Scene layout = new Scene(pane);

        pane.getChildren().add(text);
        pane.getChildren().add(button);

        window.setScene(layout);
        window.show();
    }
}
