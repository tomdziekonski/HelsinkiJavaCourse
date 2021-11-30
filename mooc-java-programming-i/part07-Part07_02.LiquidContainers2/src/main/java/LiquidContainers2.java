import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container.contains() + "/100");
            System.out.println("Second: " + container2.contains() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            } else {
                System.out.println("");
                String list[] = input.split(" ");
                String command = list[0];
                int amount = Integer.parseInt(list[1]);
                if (command.equals("add")) {
                    container.add(amount);
                }
                
                
                if(command.equals("move")) {
                
                if (container.contains() >= amount) {
                container.remove(amount);
                container2.add(amount);
                }
                
                else if (container.contains() < amount) {
                container2.add(container.contains());
                container.remove(container.contains());
                
                }}
                
                if (command.equals("remove")) {
                container2.remove(amount);
                }
                
                
            }

        }
    }}

