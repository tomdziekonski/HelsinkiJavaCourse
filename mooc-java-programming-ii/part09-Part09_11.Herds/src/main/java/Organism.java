public class Organism implements Movable {

    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
        x = 0;
        y = 0;

    }

    @Override
    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
}
