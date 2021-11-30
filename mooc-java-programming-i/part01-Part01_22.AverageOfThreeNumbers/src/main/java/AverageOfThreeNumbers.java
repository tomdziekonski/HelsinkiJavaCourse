import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
           System.out.println("Give the first number:");
           int pierwszaLiczba = Integer.valueOf(scanner.nextLine());
           System.out.println("Give the second number:");
           int drugaLiczba = Integer.valueOf(scanner.nextLine());
           System.out.println("Give the third number:");
           int trzeciaLiczba = Integer.valueOf(scanner.nextLine());
           double suma = 1.0 * (pierwszaLiczba + drugaLiczba + trzeciaLiczba);
           double srednia = suma /3;
           System.out.println("The average is " + srednia);
           
          
    }
}
