import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> year = new ArrayList<>(name.size());

        String[] splitter;
        int max = 0;
        String number = "";
        String input;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }

            splitter = input.split(",");
            name.add(splitter[0]);
            year.add(Integer.valueOf(splitter[1]));

        }

        int sum = 0;

        for (int i : year) {
            sum += i;
        }

        for (String i : name) {
            if (i.length() > max) {
                max = i.length();
                number = i;
            }

        }

        System.out.println("Longest name: " + number);
        System.out.println("Average of the birth years: " + (double) sum / year.size());
    }

}
