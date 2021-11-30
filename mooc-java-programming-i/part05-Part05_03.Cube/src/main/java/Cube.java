public class Cube {

    private int length;
    private int volume;

    public Cube(int length) {
        this.length = length;
    }

    public int volume() {
        this.volume = this.length * this.length * this.length;
        return volume;
    }

    public String toString() {
        return "The length of the edge is " + length + " and the volume " +
    volume ();
    }
}
