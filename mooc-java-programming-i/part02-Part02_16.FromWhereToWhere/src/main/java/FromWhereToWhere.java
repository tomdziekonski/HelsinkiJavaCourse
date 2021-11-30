import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int liczba2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int liczba3 = Integer.valueOf(scanner.nextLine());
        for (int i = liczba3; i <= liczba2; i++) {
            System.out.println(i);
        }

    }
}
