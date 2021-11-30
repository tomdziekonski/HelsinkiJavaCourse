import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random randomizer = new Random();
        this.numbers = new ArrayList<>();

        while (true) {
            int number = randomizer.nextInt(40) + 1;

            if (!containsNumber(number)) {
                this.numbers.add(number);
            }

            if (this.numbers.size() == 7) {
                break;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
