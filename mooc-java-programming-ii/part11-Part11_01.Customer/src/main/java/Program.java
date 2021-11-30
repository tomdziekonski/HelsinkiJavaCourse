import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        logic();

    }

    public static void logic() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a new customer: name, email, address");
        try {
            String input = scan.nextLine();
            String[] trimmer = input.split(",");
            String name = trimmer[0];
            String email = trimmer[1];
            String address = trimmer[2];
            Customer test = new Customer(name, email, address);
            System.out.println(test);
        } catch (Exception e) {
            System.out.println("Invalid input !");
            e.printStackTrace();
        }

    }

}
