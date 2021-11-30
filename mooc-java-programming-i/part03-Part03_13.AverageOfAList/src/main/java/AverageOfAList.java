import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int input = 0;
        int cycle = 0;

        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
            sum = sum + input;
            cycle++;
        }

        System.out.println("Average: " + (1.0 * sum / cycle));

    }
}
