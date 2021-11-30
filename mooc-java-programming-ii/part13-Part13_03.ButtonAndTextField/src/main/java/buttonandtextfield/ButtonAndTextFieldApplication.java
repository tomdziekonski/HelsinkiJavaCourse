package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch();
    }

    @Override
    public void start(Stage window) {
        TextField txtField = new TextField("Fill this form");
        Button button = new Button("Click me");
        FlowPane container = new FlowPane();
        Scene layout = new Scene(container);
        container.getChildren().add(txtField);
        container.getChildren().add(button);

        window.setScene(layout);
        window.show();
    }
}
