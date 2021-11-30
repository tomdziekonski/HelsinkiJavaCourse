import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = null;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        data = String.valueOf(scanner.nextLine());

        if (list.contains(data)) {
            System.out.println(data + " was found!");
        } else if (!list.contains(data)) {
            System.out.println(data + " was not found!");

        }

    }
}
