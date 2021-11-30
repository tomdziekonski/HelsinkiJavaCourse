import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.valueOf(scanner.nextLine());
        if (liczba < 0) {
            System.out.println(liczba * -1);
        } else {
            System.out.println(liczba);
        }
    }
}
