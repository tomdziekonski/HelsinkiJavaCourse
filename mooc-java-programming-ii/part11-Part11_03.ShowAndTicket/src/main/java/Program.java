import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        logic();
    }

    public static void logic() {
        String input;
        Ticket tickets = new Ticket();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Provide the title and film year");
            input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            Show film = new Show(array[0], array[1]);
            tickets.add(film);
        }
        
        if (tickets.size()>0){
        System.out.println("You bought tickets for the following films:");
        tickets.print();
        
    }
}}
