import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double liczba = 0;
        double suma = 0;
        while (true) {
            System.out.println("Give a number:");
            double dane = Double.valueOf(scanner.nextLine());

            if (dane == 0) {
                break;
            }
            if (dane > 0 || dane < 0) {
                liczba = liczba + 1;
            }

            if (dane > 0 || dane < 0) {
                suma = suma + dane;
            }
        }
        System.out.println("Average of the numbers: " + suma / liczba);
    }
}
