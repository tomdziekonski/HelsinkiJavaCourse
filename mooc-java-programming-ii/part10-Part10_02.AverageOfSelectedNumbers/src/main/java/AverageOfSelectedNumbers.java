import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        double negative = 0;
        double positive = 0;
        String input;
        
        System.out.println("Input numbers, type 'end' to stop");

        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();
        if (input.equals("n")) {
            negative = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + negative);

        } else {
            positive = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number >= 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + positive);

        }

    }

}
