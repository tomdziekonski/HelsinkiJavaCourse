import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.valueOf(scanner.nextLine());
        int liczba2 = -1;
        while (true) {
            liczba2++;
            System.out.println(liczba2);
            if (liczba == liczba2) {
                break;
            }

        }

    }
}
