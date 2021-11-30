import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String[] parts = null;
        int sum = 0;
        String input;
        while (true) {
            input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            parts = input.split(",");
            list.add(parts[1]);
        }
        Collections.sort(list);
        System.out.println("Age of the oldest:" + list.get(list.size() - 1));
        for (String i: list) {
        if (i.equals(list.get(list.size() -1))) {
            System.out.println("Additional");
        }
        }

    }
}
