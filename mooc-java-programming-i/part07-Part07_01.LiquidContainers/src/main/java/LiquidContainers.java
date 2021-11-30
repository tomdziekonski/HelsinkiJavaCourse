
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int limit = 100;
        int content = 0;
        int limit2 = 100;
        int content2 = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + content + "/" + limit);
            System.out.println("Second: " + content2 + "/" + limit2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.parseInt(parts[1]);
            if (command.equals("add") && number > 0) {
                System.out.println("");
                content = content + number;
                if (content > limit) {
                    content = 100;
                }
            } else if (command.equals("add") && number < 0) {
                System.out.println("");
            }

            if (command.equals("move") && number > 0 && number <= content) {
                System.out.println("");
                content = content - number;
                content2 = content2 + number;

            } else if (command.equals("move") && number > 0 && number <= content && number > limit2) {
                System.out.println("");
                content = content - number;
                content2 = 100;

            } else if (command.equals("move") && number > 0 && number > content) {
                content2 += content;
                content = 0;
                System.out.println("");

            }

            if (content2 > limit2) {
                content2 = 100;
            } else if (command.equals("move") && number < 0) {
                System.out.println("");
            }

            if (command.equals("remove") && number > 0 && number <= limit2 && number < content2) {
                System.out.println("");
                content2 -= number;
                if (content2 < 0) {
                    content2 = 0;
                }

            }

        }
    }
}
