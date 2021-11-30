import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = -1;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            data++;
            list.add(input);

        }
        System.out.println(list.get(data));

    }
}
