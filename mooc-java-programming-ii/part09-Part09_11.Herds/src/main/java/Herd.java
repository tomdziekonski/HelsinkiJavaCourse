import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : list) {
            i.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        if (!list.isEmpty()) {
            for (Movable i : list) {
            result = result + i + "\n";
            }
        }

        return result;
    }
}
