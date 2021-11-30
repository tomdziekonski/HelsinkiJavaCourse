import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file;
        String readResult;

        System.out.println("Name of the file:");
        file = String.valueOf(scanner.nextLine());
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                readResult = read.nextLine();
                String[] list = readResult.split(",");
                String name = String.valueOf(list[0]);
                String age = String.valueOf(list[1]);
                System.out.println(name + ", " + "age: " + age + " years");
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}
