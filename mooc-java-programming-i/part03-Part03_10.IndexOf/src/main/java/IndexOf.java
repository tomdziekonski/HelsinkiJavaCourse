import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int search = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        search = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); ++i) {
            if (search == list.get(i)) {
                System.out.println(search + " is at index " + i);

            }
        }

    }
}
