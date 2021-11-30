import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int liczba = Integer.valueOf(scanner.nextLine());
            if (liczba < 0) {
                System.out.println("Unsuitable number");
            }
            if (liczba == 0) {
                break;
            }
            if (liczba > 0) {
                System.out.println(liczba * liczba);
            }

        }
    }
}
