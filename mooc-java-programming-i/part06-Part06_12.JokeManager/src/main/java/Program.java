import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        manager.addJoke("1");
        manager.addJoke("2");
        manager.addJoke("3");
        while (true) {
        System.out.println(manager.drawJoke());
    }}
}
