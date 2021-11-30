import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        Item testItem = new Item("test");
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String newName;

        while (true) {
            System.out.println("Name:");
            newName = String.valueOf(scanner.nextLine());

            if (newName.equals("")) {
                break;
            } else {
                items.add(new Item(newName));

            }
        }
        System.out.println(items);
        System.out.println(testItem);
    }
}
