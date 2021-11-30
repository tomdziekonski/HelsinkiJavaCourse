import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int liczbaJeden = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int liczbaDwa = Integer.valueOf(scan.nextLine());
        if (liczbaJeden > liczbaDwa) {
            System.out.println("Greater number is: " + liczbaJeden);
        } else if (liczbaDwa > liczbaJeden) {
            System.out.println("Greater number is: " + liczbaDwa);
        } else if (liczbaJeden == liczbaDwa) {
            System.out.println("The numbers are equal!");
        }

    }
}
