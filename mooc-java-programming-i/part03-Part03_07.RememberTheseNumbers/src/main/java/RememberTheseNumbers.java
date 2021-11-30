import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int data = Integer.valueOf(scanner.nextLine());
            if (data == -1) {
                break;
            }

            numbers.add(data);
        }
        System.out.println(numbers);
    }
}
