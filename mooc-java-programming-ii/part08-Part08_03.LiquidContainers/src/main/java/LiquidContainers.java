import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        String input;
        String command;
        int value;
        int firstContainer = 0;
        int secondContainer = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true) {

            input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            command = parts[0];
            value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (value > 0) {
                    firstContainer += value;
                }
                if (firstContainer > 100) {
                    firstContainer = 100;
                }

                System.out.println("First:" + firstContainer + "/100");
                System.out.println("Second:" + secondContainer + "/100");
            }

            if (command.equals("move")) {
                if (value >= 0) {
                    if (firstContainer >= value) {
                        secondContainer += value;
                        firstContainer -= value;

                    } else if (firstContainer < value) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    }

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                }
                System.out.println("First:" + firstContainer + "/100");
                System.out.println("Second:" + secondContainer + "/100");

            }

            if (command.equals("remove")) {
                if (secondContainer >= value) {
                    secondContainer -= value;
                } else if (secondContainer < value) {
                    secondContainer = 0;

                }
                System.out.println("First:" + firstContainer + "/100");
                System.out.println("Second;" + secondContainer + "/100");
            }

        }
    }
}
