import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        printNumbersInRange(numbers, 0, 5);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int min, int max) {
        System.out.println("The numbers in the range[" + min + "," + max + "]");
        for (int number : numbers) {
            if ((number <= max) && (number > min)) {
                System.out.println(number);
            }

        }

    }

}
