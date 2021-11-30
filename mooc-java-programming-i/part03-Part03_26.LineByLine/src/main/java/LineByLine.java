import java.util.Arrays;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = String.valueOf(scanner.nextLine());
        String[] stringi = data.split(" ");
        for (int i = 0; i < stringi.length; i++) {
            if (data.equals("")) {
                break;
            } else {
                System.out.println((stringi[i]));

            }

        }
        String data2 = String.valueOf(scanner.nextLine());
        stringi = data2.split(" ");
        for (int i = 0; i < stringi.length; i++) {
            if (data2.equals("")) {
                break;
            } else {
                System.out.println((stringi[i]));

            }

        }

    }
}
