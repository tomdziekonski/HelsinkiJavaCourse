import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaLiczb = 0;
        int sumaLiczb = 0;
        while (true) {
            System.out.println("Give a number:");
            int dane = Integer.valueOf(scanner.nextLine());
            if (dane == 0) {
                break;
            }
            if (dane < 0 || dane > 0) {
                liczbaLiczb = liczbaLiczb + 1;
            }
            if (dane < 0 || dane > 0) {
                sumaLiczb = sumaLiczb + dane;
            }

        }
        System.out.println("Number of numbers: " + liczbaLiczb);
        System.out.println("Sum of the numbers: " + sumaLiczb);

    }

}
