import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 1;
        int suma = 0;
        System.out.println("First number?");
        int dane = Integer.valueOf(scanner.nextLine());
        liczba = dane;
        System.out.println("Last number?");
        int dane2 = Integer.valueOf(scanner.nextLine());
        while (true) {
            if (liczba <= dane2) {
                suma = suma + liczba;
                liczba++;
            } else if (liczba > dane2) {
                break;
            }

        }
        System.out.println("The sum is " + suma);
    }
}
