import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int jeden = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int dwa = Integer.valueOf(scanner.nextLine());
        int sum = jeden * dwa;
        System.out.println(jeden + " * " + dwa + " = " + sum );
 

    }
}
