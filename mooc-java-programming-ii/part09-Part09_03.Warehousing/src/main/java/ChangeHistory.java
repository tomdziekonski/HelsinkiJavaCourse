import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();

    }

    public double maxValue() {
        double start = history.get(0);
        if (history.isEmpty()) {
            return 0;
        }

        for (double i : history) {
            if (i > start) {
                start = i;
            }
        }
        return start;
    }

    public double minValue() {
        double start = history.get(0);
        if (history.isEmpty()) {
            return 0;
        }
        for (double i : history) {
            if (i < start) {
                start = i;
            }
        }
        return start;
    }

    public double average() {
        double sum = 0;
        if (history.isEmpty()) {
            return 0;
        }

        for (double i : history) {
            sum = sum + i;
        }
        return sum / history.size();
    }

    public String toString() {
        return history.toString();

    }
}
