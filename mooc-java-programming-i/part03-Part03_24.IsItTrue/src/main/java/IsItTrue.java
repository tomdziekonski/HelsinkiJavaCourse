import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Podaj tekst");
            Scanner scanner = new Scanner(System.in);
        String data = String.valueOf(scanner.nextLine());
        if (data.equals("true")) {
            System.out.println("You got it right!");
            break;
        } else {
            System.out.println("Try again");
        }

    }
}}