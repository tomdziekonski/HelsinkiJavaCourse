import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int liczba = Integer.valueOf(scan.nextLine());
        if (liczba < 5000) {
            System.out.println("No tax!");
        } else if (liczba <= 25000 && liczba >= 5000) {
            System.out.println("Tax: " + (100 + (liczba - 5000) * 0.08));
        } else if (liczba <= 55000 && liczba >= 25000) {
            System.out.println("Tax: " + (1700 + (liczba - 25000) * 0.10));
        } else if (liczba <= 200000 && liczba >= 55000) {
            System.out.println("Tax: " + (4700 + (liczba - 55000) * 0.12));
        } else if (liczba <= 1000000 && liczba >= 20000) {
            System.out.println("Tax:" + (22100 + (liczba - 200000) * 0.15));
        } else if (liczba > 1000000) {
            System.out.println("Tax:" + (142100 + (liczba - 1000000) * 0.17));

        }
    }

}
