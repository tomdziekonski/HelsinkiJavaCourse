package application;

import java.util.concurrent.atomic.AtomicInteger;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        BorderPane Layout = new BorderPane();
        VBox Vertical = new VBox();
        Label Savings = new Label("Monthly savings");

        Label Interest = new Label("Yearly interest rate");

        Slider SavingsSlider = new Slider(25, 250, 10);
        SavingsSlider.setShowTickLabels(true);
        SavingsSlider.setShowTickMarks(true);

        Slider InterestSlider = new Slider(0, 10, 10);
        InterestSlider.setShowTickLabels(true);
        InterestSlider.setShowTickMarks(true);

        BorderPane FirstSliderPane = new BorderPane();
        BorderPane SecondSliderPane = new BorderPane();

        NumberAxis x = new NumberAxis(0, 30, 3);
        NumberAxis y = new NumberAxis();

        LineChart<Number, Number> Chart = new LineChart<>(x, y);
        Chart.setTitle("Yearly Saving Calculator");
        XYChart.Series ChartData = new XYChart.Series<>();
        XYChart.Series InterestChartData = new XYChart.Series<>();

        Layout.setCenter(Chart);
        Layout.setTop(Vertical);
        Vertical.getChildren().add(FirstSliderPane);
        Vertical.getChildren().add(SecondSliderPane);

        Label SavingsValue = new Label("25");
        Label InterestSavingsValue = new Label("10");

        SavingsSlider.valueProperty().addListener((ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) -> {
            ChartData.getData().clear();
            SavingsValue.textProperty().setValue(String.valueOf(newValue.doubleValue()));
            oldValue = 0.0;

            for (int i = 0; i < 31; i++) {
                ChartData.getData().add(new XYChart.Data(i, newValue.doubleValue() * 12 * i));
            }
        });
        Chart.getData().add(ChartData);

        InterestSlider.valueProperty().addListener((ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) -> {
            InterestChartData.getData().clear();
            InterestSavingsValue.textProperty().setValue(String.valueOf(newValue.doubleValue()));
            oldValue = 0.0;
            double savings = SavingsSlider.getValue();

            for (int i = 0; i < 31; i++) {
                InterestChartData.getData().add(new XYChart.Data(i, savings * 12 * i * newValue.doubleValue()));
            }
        });
        Chart.getData().add(InterestChartData);

        FirstSliderPane.setLeft(Savings);
        FirstSliderPane.setRight(SavingsValue);
        FirstSliderPane.setCenter(SavingsSlider);

        SecondSliderPane.setLeft(Interest);
        SecondSliderPane.setCenter(InterestSlider);
        SecondSliderPane.setRight(InterestSavingsValue);

        Scene scene = new Scene(Layout);
        window.setScene(scene);
        window.setTitle("Savings Calculator Chart");
        window.show();
    }
}
