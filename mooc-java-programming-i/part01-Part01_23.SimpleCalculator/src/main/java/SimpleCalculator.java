import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
            System.out.println("Give the first number:");
            int pierwsza = Integer.valueOf(scanner.nextLine());
            System.out.println("Give the second number:");
            int druga = Integer.valueOf(scanner.nextLine());
            int suma = pierwsza + druga;
            int odejmowanie = pierwsza - druga;
            int mnozenie = pierwsza * druga;
            double dzielenie = 1.0 * pierwsza / druga;
            System.out.println(pierwsza + " + " + druga + " = " + suma);
            System.out.println(pierwsza + " - " + druga + " = " + odejmowanie);
            System.out.println(pierwsza + " * " + druga + " = " + mnozenie);
            System.out.println(pierwsza + " / " + druga + " = " + dzielenie);
    }
    
}
