import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int result = 0;
        double finalResult;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {

                break;
            }
            if (input > 0) {
                list.add(input);
            }

        }
        for (int i : list) {

            result = result + i;

        }
        if (list.isEmpty()) {
            System.out.println("Cannot calculate the average");
        }
        finalResult = (double) result / list.size();
        if (finalResult > 0) {
            System.out.println(finalResult);
        }

        

    }
}
