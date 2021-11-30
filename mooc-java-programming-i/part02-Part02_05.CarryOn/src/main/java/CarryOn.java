import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String tekst = String.valueOf(scanner.nextLine());
            if (tekst.equals("no")) {break;}
            

        }
        System.out.println("OK, we are done");
    }
}
