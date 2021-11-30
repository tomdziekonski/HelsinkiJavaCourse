import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] parts;
        int bridge = 0;
        String name = "";

        

        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            parts = input.split(",");
            Integer age = Integer.parseInt(parts[1]);
            if (age >= bridge) {
                bridge = age;
                name = parts[0];
            }

        }

        //for (String i: ages) {
        // i = String.parseInt(i);
        // }
        //    }
        //  Collections.sort(names);
        // int cycle =1;
        //  while (cycle < names.size()) {
        //  ages.add(cycle);
        //  cycle++;
        // cycle++;
        // }
        //Collections.sort(ages);
        System.out.println("Name of the oldest: " + name);

    }
}
