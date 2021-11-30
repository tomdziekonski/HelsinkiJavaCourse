import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double liczba = 0;
        double suma = 0;
        while (true) {
            System.out.println("Podaj dane:");
            double dane = Double.valueOf(scanner.nextLine());
            if (dane == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (dane > 0) {
                suma = suma + dane;
            }
            if (dane > 0) {
                liczba = liczba + 1;
            }
            //if (dane 0 ) {System.out.println("Cannot calculate the average");}

        }
        System.out.println("Srednia: " + suma / liczba);

    }
}
