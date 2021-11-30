import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int liczba = Integer.valueOf(scan.nextLine());
        if (liczba % 4 == 0 && liczba % 100 == 0 && liczba % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (liczba % 4 == 0 && liczba % 100 == 0 && !(liczba % 400 == 0)) {
            System.out.println("The year is not a leap year.");
        } else if (liczba % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
