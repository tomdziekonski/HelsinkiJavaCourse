import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Enter username:");
        String username = String.valueOf(scanner.nextLine());
        System.out.println("Enter password:");
        String password = String.valueOf(scanner.nextLine());

        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
            break;
        } else if (username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
            break;
        } else {
            System.out.println("Incorrect username or password!");

        }
    }
}}
