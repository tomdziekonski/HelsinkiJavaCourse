import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
        dictionary = new SimpleDictionary();
        scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            String input;
            String input2;
            String input3;
            System.out.println("Command:");
            input = String.valueOf(scanner.nextLine());
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.println("Word:");
                input2 = String.valueOf(scanner.nextLine());
                System.out.println("Translation:");
                input3 = String.valueOf(scanner.nextLine());
                this.dictionary.add(input2, input3);
                continue;

            }

            if (input.equals("search")) {
                System.out.println("To be translated:");
                input2 = String.valueOf(scanner.nextLine());
                if (this.dictionary.translate(input2) == null) {
                    System.out.println("Word " + input2 + " was not found");
                    continue;
                }
                System.out.println("Translation: " + this.dictionary.translate(input2));
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
