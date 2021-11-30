
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        value = value - 1;
        if (value < 0) {
            value = 0;
        }
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }

    public void reset() {
        value = 0;
    }

    // the other methods go here
}
