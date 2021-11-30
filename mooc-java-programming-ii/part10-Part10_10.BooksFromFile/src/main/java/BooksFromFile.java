import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\dziekonskit\\Desktop\\Java\\output\\books.txt";
        List<Book> books = readBooks(path);

        for (Book i : books) {
            System.out.println(i);
        }
    }

    public static List<Book> readBooks(String file) throws IOException {
        List<Book> books = new ArrayList<>();
        Files.lines(Paths.get(file)).map(row -> row.split(",")).map(row -> new Book(row[0], Integer.valueOf(row[1]), Integer.valueOf(row[2]), row[3])).forEach(person -> books.add(person));
        return books;
    }

}
