import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        if (numberOfFaces > 0 && numberOfFaces % 2 == 0) {
            this.random = new Random();
            this.numberOfFaces = numberOfFaces;
        }
        throw new NullPointerException("An even number of die sides has to be provided");
    }

    public int throwDie() {
        int result = this.random.nextInt(this.numberOfFaces) + 1;
        return result;
    }
}
