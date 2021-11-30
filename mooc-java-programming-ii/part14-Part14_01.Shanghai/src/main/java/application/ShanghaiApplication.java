package application;

import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        String data = "2007 73 2008 68 2009 72 2010 72 2011 74 2012 73 2013 76 2014 73 2015 67 2016 56 2017 56";

        ArrayList<Integer> year = new ArrayList<>();
        ArrayList<Integer> rating = new ArrayList<>();
        String[] split = data.split(" ");
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                int datax = Integer.valueOf(split[i]);
                year.add(datax);
            } else {
                int datay = Integer.valueOf(split[i]);
                rating.add(datay);
            }
        }

        for (int i = 0; i < year.size(); i++) {
            hash.put(year.get(i), rating.get(i));
        }

        NumberAxis x = new NumberAxis(2006, 2017, 4);
        NumberAxis y = new NumberAxis(0, 100, 4);
        x.setLabel("Year");
        y.setLabel("Ranking");

        LineChart<Number, Number> chart = new LineChart<Number, Number>(x, y);
        chart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series ChartValues = new XYChart.Series();

        for (HashMap.Entry<Integer, Integer> i : hash.entrySet()) {
            int key = i.getKey();
            int value = i.getValue();
            ChartValues.getData().add(new XYChart.Data(key, value));
        }

        chart.getData().add(ChartValues);

        window.setTitle("Chart");
        Scene scene = new Scene(chart, 800, 600);
        window.setScene(scene);
        window.show();
    }
}
