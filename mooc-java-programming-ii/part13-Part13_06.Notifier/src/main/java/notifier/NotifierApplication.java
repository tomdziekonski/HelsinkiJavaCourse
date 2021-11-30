package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch();
    }

    @Override
    public void start(Stage window) {
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        VBox layout = new VBox();
        layout.getChildren().addAll(text, button, label);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(text.getText());
            }
        });

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}
