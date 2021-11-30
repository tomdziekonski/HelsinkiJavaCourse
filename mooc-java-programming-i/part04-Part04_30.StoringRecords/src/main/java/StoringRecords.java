import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String data = String.valueOf(read.nextLine());
                String[] list = data.split(",");
                String nameList = list[0];
                int ageList = Integer.valueOf(list[1]);
                persons.add(new Person(nameList, ageList));

            }
        } catch (Exception error) {
            System.out.println(error);
        }
        return persons;

    }
}
