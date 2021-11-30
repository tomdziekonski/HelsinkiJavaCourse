import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        while (true) {
            System.out.println("Give a number:");
            int liczba2 = Integer.valueOf(scanner.nextLine());
            if (liczba2 == 0) {
                break;
            } else {
                liczba = liczba + liczba2;
            }

        }
        System.out.println("Sum of the numbers: " + liczba);

    }
}
