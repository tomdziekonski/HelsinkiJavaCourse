import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(list, scan);
        ui.start();
    } 
}
