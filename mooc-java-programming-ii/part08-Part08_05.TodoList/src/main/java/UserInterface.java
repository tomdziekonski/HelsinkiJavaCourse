import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;

    }

    public void start() {
        String command;
        int index;

        System.out.println("Command:");

        while (true) {
            command = String.valueOf(scan.nextLine());

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add:");
                String toAdd = String.valueOf(scan.nextLine());
                list.add(toAdd);
                System.out.println("Command:");
                continue;
            }

            if (command.equals("list")) {
                if (list.getList() == 0) {
                    System.out.println("List is empty!");
                    System.out.println("Command:");
                    continue;

                } else {
                    list.print();
                    System.out.println("Command:");
                    continue;
                }

            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                index = Integer.valueOf(scan.nextLine());
                list.remove(index);
                System.out.println("Command:");
                continue;
            }

        }

    }
}
