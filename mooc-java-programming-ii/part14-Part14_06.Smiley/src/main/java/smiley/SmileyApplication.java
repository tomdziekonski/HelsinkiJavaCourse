package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        Canvas canva = new Canvas(640, 480);
        GraphicsContext drawing = canva.getGraphicsContext2D();
        drawing.setFill(Color.BLACK);
        drawing.fillRect(100, 50, 100, 100);
        drawing.fillRect(400, 50, 100, 100);

        drawing.fillRect(0, 300, 100, 100);
        drawing.fillRect(500, 300, 100, 100);

        drawing.fillRect(100, 400, 400, 100);

        BorderPane layout = new BorderPane();
        layout.setStyle("-fx-background-color: white");
        layout.setCenter(canva);

        Scene scene = new Scene(layout);

        window.sizeToScene();
        window.setScene(scene);
        window.show();
    }
}
