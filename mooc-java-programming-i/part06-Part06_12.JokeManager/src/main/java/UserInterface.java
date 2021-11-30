import java.util.Scanner;

public class UserInterface {

    private JokeManager manager = new JokeManager();
    private Scanner scanner = new Scanner(System.in);

    

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = String.valueOf(scanner.nextLine());
                manager.addJoke(joke);

            } else if (input.equals("2")) {
                System.out.println(manager.drawJoke());

            } else if (input.equals("3")) {
                manager.printJokes();
            }

        }
    }
}
