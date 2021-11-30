package application;

public class TemperatureSensor implements Sensor {
    private boolean SensorOn;

    public TemperatureSensor() {
        this.SensorOn = false;
    }

    public int read() {
        if (this.SensorOn = true) {
            int min = -30;
            int max = 30;
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    
            return random;
        }

        throw new IllegalStateException();
    }

    public void setOn() {
        this.SensorOn = true;
    }

    public void setOff() {
        this.SensorOn = false;
    }

    public boolean isOn() {
        return this.SensorOn;
    }

}
