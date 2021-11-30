import java.util.Scanner;

public class UI {

    private Container container = new Container();
    private Container container2 = new Container();

    public UI() {
    }

    public void program(Scanner scan) {
        String command;
        String input;
        int value;
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true) {
            input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            command = String.valueOf(parts[0]);
            value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                this.container.add(value);
            }

            else if (command.equals("remove")) {
                this.container2.remove(value);
            }

            else if (command.equals("move")) {

                if (value > this.container.contains()) {
                    this.container2.add(this.container.contains());
                    this.container.remove(value);
                } else {
                    this.container.remove(value);
                    this.container2.add(value);
                }
            }
            System.out.println("");
            System.out.println("First:" + container);
            System.out.println("Second:" + container2);
        }

    }
}
