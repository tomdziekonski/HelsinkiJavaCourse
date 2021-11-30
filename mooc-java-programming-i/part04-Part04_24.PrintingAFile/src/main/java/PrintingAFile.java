import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        String input;
        try (Scanner scan = new Scanner(Paths.get("data.txt"))) {

            while (scan.hasNextLine()) {
                input = String.valueOf(scan.nextLine());
                System.out.println(input);
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }
}
