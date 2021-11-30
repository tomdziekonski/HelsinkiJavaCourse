public class Cube {

    private int value;

    public Cube(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void cubeResult() {
        this.value = this.value * this.value * this.value;
        System.out.println(this.value);
    }
}
