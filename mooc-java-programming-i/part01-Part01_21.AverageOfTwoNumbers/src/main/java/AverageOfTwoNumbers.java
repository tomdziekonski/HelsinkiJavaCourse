import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int pierwsza = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int druga = Integer.valueOf(scanner.nextLine());
        double suma = 1.0 * (pierwsza + druga)/2;
        System.out.println("The average is " + suma);

    }
}
