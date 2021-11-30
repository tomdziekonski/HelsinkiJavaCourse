import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.valueOf(scanner.nextLine());
        System.out.println(liczba);
        while (true) {
            liczba++;
            System.out.println(liczba);
            if (liczba == 100) {
                break;
            }

        }

    }
}
