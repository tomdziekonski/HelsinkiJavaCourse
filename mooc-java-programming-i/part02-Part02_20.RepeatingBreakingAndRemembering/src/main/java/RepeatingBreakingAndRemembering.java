import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers:");
        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int odd = 0;
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (input % 2 == 0) {
                even++;
                sum = sum + input;
                numberOfNumbers++;
            } else if (input % 2 != 0) {
                odd++;
                sum = sum + input;
                numberOfNumbers++;
            }

        }
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + ((double) sum / (double) numberOfNumbers));
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);

    }
}
