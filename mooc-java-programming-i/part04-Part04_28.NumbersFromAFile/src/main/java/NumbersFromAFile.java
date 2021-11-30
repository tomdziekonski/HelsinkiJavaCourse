import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int cycle = 0;
        int temp;
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                temp = Integer.valueOf(read.nextLine());
                if (temp >= lowerBound && temp <= upperBound) {
                    cycle++;
                }

            }
        } catch (Exception error) {

        }
        System.out.println("Numbers: " + cycle);
    }

}
