import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        int liczba = 1;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int dane = Integer.valueOf(scanner.nextLine());
        while (dane >= liczba) {
            suma = suma + liczba;
            liczba++;

        }
        System.out.println(suma);

    }
}
