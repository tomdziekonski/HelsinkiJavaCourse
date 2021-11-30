package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

        nappi.setOnAction((value) -> {
            AudioClip clip = new AudioClip("file:Applause-Yannick_Lemieux.wav");
            clip.play();
        });

        Scene scene = new Scene(pane, 600, 400);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
