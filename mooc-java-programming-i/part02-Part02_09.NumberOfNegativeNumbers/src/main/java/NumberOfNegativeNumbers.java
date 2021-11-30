
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        while (true) {
            System.out.println("Give a number:");
            int liczba2 = Integer.valueOf(scanner.nextLine());
            if (liczba2 == 0) {
                break;
            } else if (liczba2 < 0) {
                System.out.println(liczba = liczba + 1);

            }

        }
        System.out.println("Number of negative numbers: " + liczba);
    }
}
