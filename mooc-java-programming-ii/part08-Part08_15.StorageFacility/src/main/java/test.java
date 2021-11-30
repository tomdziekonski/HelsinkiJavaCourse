import java.util.Random;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomize = new Random();
        int random = randomize.nextInt(5);

        while (true) {

            System.out.println("Enter the number");

            int input = Integer.valueOf(scan.nextLine());
            if (input == random) {
                System.out.println("That's the number !");
                break;
            } else if (random < input) {
                System.out.println("The number you are looking for is smaller");
            } else if (random > input) {
                System.out.println("The number you are looking for is greater");
            }

        }
    }

}
