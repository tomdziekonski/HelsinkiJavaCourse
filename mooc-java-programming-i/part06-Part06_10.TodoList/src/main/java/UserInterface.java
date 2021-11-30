import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        list = new TodoList();
        this.scanner = scan;
        scan = new Scanner(System.in);
    }

    public void start() {
        String input;
        String add;
        int remove;
        while (true) {
            System.out.println("Command: ");
            input = String.valueOf(scanner.nextLine());
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
            System.out.println("To add: ");
            add = String.valueOf(scanner.nextLine());
            list.add(add);
            }
            if (input.equals("list")) {
            list.print();
            }
            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
            remove = Integer.valueOf(scanner.nextLine());
            list.remove(remove);
            }
            

        }
    }
}
