import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int duration;
        int maximum;
        while (true) {
            System.out.println("Name: ");
            name = String.valueOf(scanner.nextLine());
            if (name.equals("")) {
                break;
            }
            System.out.println("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.println("Program's maximum duration? ");
        maximum = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram test : programs) {
            if (test.getDuration() <= maximum) {
                System.out.println(test);
            }
        }
    }
}
