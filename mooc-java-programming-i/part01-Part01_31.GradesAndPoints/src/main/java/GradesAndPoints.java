
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int liczba = Integer.valueOf(scan.nextLine());
        if (liczba < 0) {
            System.out.println("impossible!");
        } else if (liczba <= 49) {
            System.out.println("failed");
        } else if (liczba == 50) {
            System.out.println("1");
        } else if (liczba <= 59) {
            System.out.println("1");
        } else if (liczba == 60) {
            System.out.println("2");
        } else if (liczba <= 69) {
            System.out.println("2");
        } else if (liczba == 70) {
            System.out.println("3");
        } else if (liczba <= 79) {
            System.out.println("3");
        } else if (liczba == 80) {
            System.out.println("4");
        } else if (liczba <= 89) {
            System.out.println("4");
        } else if (liczba <= 100) {
            System.out.println("5");
        } else if (liczba > 100) {
            System.out.println("incredible!");

        }
    }
}
