package application;

import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        String Years = "1968	1972	1976	1980	1984	1988	1992	1996	2000	2004	2008";
        String KOK = "16.1	18.1	20.9	22.9	23.0	22.9	19.1	21.6	20.8	21.8	23.4";
        String SDP = "23.9	27.1	24.8	25.5	24.7	25.2	27.1	24.5	23.0	24.1	21.2";
        String KESK = "18.9	18.0	18.4	18.7	20.2	21.1	19.2	21.8	23.8	22.8	20.1";
        String VIHR = "-	-	-	-	2.8	2.3	6.9	6.3	7.7	7.4	8.9";
        String VAS = "16.9	17.5	18.5	16.6	13.1	12.6	11.7	10.4	9.9	9.6	8.8";
        String PS = "7.3	5.0	2.1	3.0	5.3	3.6	2.4	0.9	0.7	0.9	5.4";
        String RKP = "5.6	5.2	4.7	4.7	5.1	5.3	5.0	5.4	5.1	5.2	4.7";

        String[] splitter = Years.split("\t");
        ArrayList<Integer> YearList = new ArrayList<>();
        ArrayList<Double> KOKList = new ArrayList<>();
        ArrayList<Double> SDPList = new ArrayList<>();
        ArrayList<Double> KESKList = new ArrayList<>();
        ArrayList<Double> VIHRList = new ArrayList<>();
        ArrayList<Double> VASList = new ArrayList<>();
        ArrayList<Double> PSList = new ArrayList<>();
        ArrayList<Double> RKPList = new ArrayList<>();

        HashMap<Integer, Double> KOKMap = new HashMap<>();
        HashMap<Integer, Double> SDPMap = new HashMap<>();
        HashMap<Integer, Double> KESKMap = new HashMap<>();
        HashMap<Integer, Double> VIHRMap = new HashMap<>();
        HashMap<Integer, Double> VASMap = new HashMap<>();
        HashMap<Integer, Double> PSMap = new HashMap<>();
        HashMap<Integer, Double> RKPMap = new HashMap<>();

        for (int i = 0; i < splitter.length; i++) {
            YearList.add(Integer.valueOf(splitter[i]));
        }

        splitter = KOK.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            KOKList.add(Double.valueOf(splitter[i]));
        }

        for (int i = 0; i < KOKList.size(); i++) {
            KOKMap.put(YearList.get(i), KOKList.get(i));
        }

        splitter = SDP.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            SDPList.add(Double.valueOf(splitter[i]));
        }

        for (int i = 0; i < KOKList.size(); i++) {
            SDPMap.put(YearList.get(i), SDPList.get(i));
        }

        splitter = KESK.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            KESKList.add(Double.valueOf(splitter[i]));
        }

        for (int i = 0; i < KOKList.size(); i++) {
            KESKMap.put(YearList.get(i), KESKList.get(i));
        }

        splitter = VIHR.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            String check = (splitter[i]);
            if (!check.equals("-")) {
                VIHRList.add(Double.valueOf(splitter[i]));
            } else {
                VIHRList.add(-1.0);
            }
        }

        for (int i = 0; i < KOKList.size(); i++) {
            double check = VIHRList.get(i);
            if (check != -1.0) {
                VIHRMap.put(YearList.get(i), VIHRList.get(i));
            }
        }

        splitter = VAS.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            VASList.add(Double.valueOf(splitter[i]));
        }

        for (int i = 0; i < KOKList.size(); i++) {
            VASMap.put(YearList.get(i), VASList.get(i));
        }

        splitter = PS.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            PSList.add(Double.valueOf(splitter[i]));
        }

        for (int i = 0; i < KOKList.size(); i++) {
            PSMap.put(YearList.get(i), PSList.get(i));
        }

        splitter = RKP.split("\t");

        for (int i = 0; i < splitter.length; i++) {
            RKPList.add(Double.valueOf(splitter[i]));
        }

        for (int i = 0; i < RKPList.size(); i++) {
            RKPMap.put(YearList.get(i), RKPList.get(i));
        }

        NumberAxis x = new NumberAxis(1968, 2008, 4);
        NumberAxis y = new NumberAxis(0, 30, 4);
        LineChart<Number, Number> Chart = new LineChart<>(x, y);
        Chart.setTitle("Relative support of the parties");
        XYChart.Series KOKData = new XYChart.Series<>();
        KOKData.setName("KOK");

        for (HashMap.Entry<Integer, Double> i : KOKMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            KOKData.getData().add(new XYChart.Data(key, value));
        }
        Chart.getData().add(KOKData);

        XYChart.Series SDPData = new XYChart.Series<>();

        for (HashMap.Entry<Integer, Double> i : SDPMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            SDPData.getData().add(new XYChart.Data(key, value));
        }
        SDPData.setName("SDP");

        Chart.getData().add(SDPData);

        XYChart.Series KESKData = new XYChart.Series<>();

        for (HashMap.Entry<Integer, Double> i : KESKMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            KESKData.getData().add(new XYChart.Data(key, value));
        }
        KESKData.setName("KESK");

        Chart.getData().add(KESKData);

        XYChart.Series VIHRData = new XYChart.Series<>();

        for (HashMap.Entry<Integer, Double> i : VIHRMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            VIHRData.getData().add(new XYChart.Data(key, value));
        }
        VIHRData.setName("VIHR");

        Chart.getData().add(VIHRData);

        XYChart.Series VASData = new XYChart.Series<>();

        for (HashMap.Entry<Integer, Double> i : VASMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            VASData.getData().add(new XYChart.Data(key, value));
        }
        VASData.setName("VAS");

        Chart.getData().add(VASData);

        XYChart.Series PSData = new XYChart.Series<>();

        for (HashMap.Entry<Integer, Double> i : PSMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            PSData.getData().add(new XYChart.Data(key, value));
        }
        PSData.setName("PS");
        Chart.getData().add(PSData);

        XYChart.Series RKPData = new XYChart.Series<>();

        for (HashMap.Entry<Integer, Double> i : RKPMap.entrySet()) {
            int key = i.getKey();
            double value = i.getValue();
            RKPData.getData().add(new XYChart.Data(key, value));
        }
        RKPData.setName("RKP");
        Chart.getData().add(RKPData);

        Scene scene = new Scene(Chart);
        window.setScene(scene);
        window.show();
    }
}
