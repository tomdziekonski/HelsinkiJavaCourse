import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int numberAmount = 0;
        int input = Integer.valueOf(scanner.nextLine());

        while (numberAmount < input) {
            numberAmount++;
            printText();

        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
