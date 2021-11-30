package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch();
    }

    @Override
    public void start(Stage window) {
        Label north = new Label("NORTH");
        Label east = new Label("EAST");
        Label south = new Label("SOUTH");
        Label west = new Label("WEST");

        BorderPane layout = new BorderPane();
        layout.setTop(north);
        layout.setRight(east);
        layout.setLeft(west);
        layout.setBottom(south);

        Scene content = new Scene(layout);
        window.setScene(content);
        window.show();
    }
}
