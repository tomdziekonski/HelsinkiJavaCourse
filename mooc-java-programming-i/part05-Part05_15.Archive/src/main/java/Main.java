import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String ident;
        ArrayList<Archive> list = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            name = String.valueOf(scanner.nextLine());
            if (name.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            ident = String.valueOf(scanner.nextLine());
            if (ident.equals("")) {
                break;
            }
            Archive arch = new Archive(name, ident);
            if (!list.contains(arch)) {
            list.add(arch); }
        }
        for (Archive a : list) {
            System.out.println(a);

        }

    }
}
