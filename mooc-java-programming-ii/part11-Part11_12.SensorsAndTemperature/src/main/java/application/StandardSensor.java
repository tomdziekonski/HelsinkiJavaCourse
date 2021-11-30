package application;

public class StandardSensor implements Sensor {
    private int SensorValue;

    public StandardSensor(int data) {
        this.SensorValue = data;
    }

    @Override
    public int read() {
        return this.SensorValue;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public boolean isOn() {
        return true;
    }
}
