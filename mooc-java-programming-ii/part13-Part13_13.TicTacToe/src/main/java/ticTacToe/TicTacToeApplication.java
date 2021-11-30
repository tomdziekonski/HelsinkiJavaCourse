package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        Label GameInfo = new Label("Turn: X");
        GameInfo.setFont(Font.font("Monospaced", 40));

        Button GridButton = new Button();
        GridButton.setFont(Font.font("Monospaced", 40));
        GridButton.setPrefWidth(80);

        Button GridButton2 = new Button();
        GridButton2.setFont(Font.font("Monospaced", 40));
        GridButton2.setPrefWidth(80);

        Button GridButton3 = new Button();
        GridButton3.setFont(Font.font("Monospaced", 40));
        GridButton3.setPrefWidth(80);

        Button GridButton4 = new Button();
        GridButton4.setFont(Font.font("Monospaced", 40));
        GridButton4.setPrefWidth(80);

        Button GridButton5 = new Button();
        GridButton5.setFont(Font.font("Monospaced", 40));
        GridButton5.setPrefWidth(80);

        Button GridButton6 = new Button();
        GridButton6.setFont(Font.font("Monospaced", 40));
        GridButton6.setPrefWidth(80);

        Button GridButton7 = new Button();
        GridButton7.setFont(Font.font("Monospaced", 40));
        GridButton7.setPrefWidth(80);

        Button GridButton8 = new Button();
        GridButton8.setFont(Font.font("Monospaced", 40));
        GridButton8.setPrefWidth(80);

        Button GridButton9 = new Button();
        GridButton9.setFont(Font.font("Monospaced", 40));
        GridButton9.setPrefWidth(80);

        GridPane grid = new GridPane();
        grid.setMaxSize(400, 40);

        grid.add(GridButton, 0, 0);
        grid.add(GridButton2, 0, 1);
        grid.add(GridButton3, 0, 2);
        grid.add(GridButton4, 1, 0);
        grid.add(GridButton5, 1, 1);
        grid.add(GridButton6, 1, 2);
        grid.add(GridButton7, 2, 0);
        grid.add(GridButton8, 2, 1);
        grid.add(GridButton9, 2, 2);

        GridButton.setOnAction((value) -> {

            if (GameInfo.getText().equals("Turn: X")) {
                GridButton.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton.setDisable(true);
        });

        GridButton2.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton2.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton2.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton2.setDisable(true);
        });

        GridButton3.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton3.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton3.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton3.setDisable(true);

        });

        GridButton4.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton4.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton4.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }

            GridButton4.setDisable(true);

        });

        GridButton5.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton5.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton5.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton5.setDisable(true);
        });

        GridButton6.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton6.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton6.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton6.setDisable(true);
        });

        GridButton7.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton7.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton7.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton7.setDisable(true);
        });

        GridButton8.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton8.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton8.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton8.setDisable(true);
        });

        GridButton9.setOnAction((value) -> {
            if (GameInfo.getText().equals("Turn: X")) {
                GridButton9.setText("X");
                GameInfo.setText("Turn: O");
            } else {
                GameInfo.setText("Turn: X");
                GridButton9.setText("O");
            }

            if (GridButton.getText().equals("X") && GridButton2.getText().equals("X") && GridButton3.getText().equals("X")
                    || GridButton4.getText().equals("X") && GridButton5.getText().equals("X") && GridButton6.getText().equals("X")
                    || GridButton7.getText().equals("X") && GridButton8.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton4.getText().equals("X") && GridButton7.getText().equals("X")
                    || GridButton2.getText().equals("X") && GridButton5.getText().equals("X") && GridButton8.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton6.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton.getText().equals("X") && GridButton5.getText().equals("X") && GridButton9.getText().equals("X")
                    || GridButton3.getText().equals("X") && GridButton5.getText().equals("X") && GridButton7.getText().equals("X")
                    
                    || GridButton.getText().equals("O") && GridButton2.getText().equals("O") && GridButton3.getText().equals("O")
                    || GridButton4.getText().equals("O") && GridButton5.getText().equals("O") && GridButton6.getText().equals("O")
                    || GridButton7.getText().equals("O") && GridButton8.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton4.getText().equals("O") && GridButton7.getText().equals("O")
                    || GridButton2.getText().equals("O") && GridButton5.getText().equals("O") && GridButton8.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton6.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton.getText().equals("O") && GridButton5.getText().equals("O") && GridButton9.getText().equals("O")
                    || GridButton3.getText().equals("O") && GridButton5.getText().equals("O") && GridButton7.getText().equals("O")) {
                GameInfo.setText("The end!");
                GridButton.setDisable(true);
                GridButton2.setDisable(true);
                GridButton3.setDisable(true);
                GridButton4.setDisable(true);
                GridButton5.setDisable(true);
                GridButton6.setDisable(true);
                GridButton7.setDisable(true);
                GridButton8.setDisable(true);
                GridButton9.setDisable(true);
            }
            GridButton9.setDisable(true);
        });

        BorderPane layout = new BorderPane();
        layout.setTop(GameInfo);
        layout.setCenter(grid);

        Scene WindowContent = new Scene(layout);
        window.setScene(WindowContent);
        window.show();
    }
}
