import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.println("Give a number:");
        int inputValue = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= inputValue; i++) {
            result = result * i;
        }
        

        System.out.println("Factorial: " + result);
    }
}
