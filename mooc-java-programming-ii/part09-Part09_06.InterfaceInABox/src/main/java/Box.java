import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> list;
    private double capacity;

    public Box(double capacity) {
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable pack) {
        if (this.capacity > pack.weight()) {
            this.list.add(pack);
            this.capacity = this.capacity - pack.weight();

        }

    }
    
    public double weight() {
    double sum = 0;
        for (Packable i : list) {
            sum = sum + i.weight();

        }
    return sum;
    }

    public String toString() {
        double sum = 0;
        for (Packable i : list) {
            sum = sum + i.weight();

        }
        return "Box: " + list.size() + " items, total weight " + weight() + " kg";
    }
}
