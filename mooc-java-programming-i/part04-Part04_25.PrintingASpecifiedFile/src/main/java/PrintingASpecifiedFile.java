import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        String input;
        String inputRead;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        input = String.valueOf(scanner.nextLine());

        try (Scanner read = new Scanner(Paths.get(input))) {
            while (read.hasNextLine()) {
                inputRead = String.valueOf(read.nextLine());
                System.out.println(inputRead);

            }
        } catch (Exception error) {
            System.out.println(error);
        }

    }
}
