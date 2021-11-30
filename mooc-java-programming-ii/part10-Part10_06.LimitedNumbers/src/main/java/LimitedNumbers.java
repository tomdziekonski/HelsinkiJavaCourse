import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        ArrayList<Integer> data = new ArrayList<>();

        while (true) {
            System.out.println("Provide data, type in a negative number to stop");
            input = scanner.nextLine();
            if (input.contains("-")) {
                break;
            }
            int converter = Integer.valueOf(input);
            data.add(converter);
        }

        data.stream().filter(number -> number > 0 && number < 6).forEach(result -> System.out.println(result));

    }
}
