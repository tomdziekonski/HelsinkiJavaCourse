import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.valueOf(scanner.nextLine());
        int liczba2 = Integer.valueOf(scanner.nextLine());
        if (liczba > liczba2) {
            System.out.println(liczba + " is greater than " + liczba2 + ".");
        }
        if (liczba < liczba2) {
            System.out.println(liczba + " is smaller than " + liczba2 + ".");
        } else if (liczba == liczba2) {
            System.out.println(liczba + " is equal to " + liczba2 + ".");
        }

    }
}
