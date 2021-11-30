import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj liczbe 1: ");
        int liczba = Integer.valueOf(scanner.nextLine());
        //System.out.println("Podaj liczbe 2: ");
        int liczba2 = Integer.valueOf(scanner.nextLine());
        int suma = (liczba + liczba2);
        double pierwiastek = Math.sqrt(suma);
        System.out.println(pierwiastek);
    }
}
