package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list;
    private ArrayList<Integer> avg;

    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }

    public AverageSensor() {
        this.list = new ArrayList<>();
        this.avg = new ArrayList<>();
    }

    public void setOn() {
        for (Sensor i : this.list) {
            i.setOn();
        }
    }

    public void setOff() {
        for (Sensor i : this.list) {
            i.setOff();
        }
    }

    public boolean isOn() {
        int on = 0;
        for (Sensor i : this.list) {
            if (i.isOn()) {
                on++;
            }
        }

        if (on == list.size()) {
            return true;
        }
        return false;

    }

    public int read() {
        int result = 0;

        if (isOn() == true) {
            for (Sensor i : this.list) {
                result = result + i.read();
            }

            int avg = result / this.list.size();
            this.avg.add(avg);

            return avg;

        } else if (this.list.isEmpty() || isOn() == false) {
            throw new IllegalStateException();
        }

        return 0;
    }

    public List<Integer> readings() {
        if (isOn() == false) {
            return new ArrayList<Integer>();
        }

        return this.avg;
    }
}
