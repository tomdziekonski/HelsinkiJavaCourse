
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = "";
        int cycle = 0;
        while (true) {
            data = String.valueOf(scanner.nextLine());
            if (data.equals("")) {
                break;
            } else {

                String[] array = data.split(" ");
                System.out.println(array[0]);
                cycle++;
            }

        }
    }
}
