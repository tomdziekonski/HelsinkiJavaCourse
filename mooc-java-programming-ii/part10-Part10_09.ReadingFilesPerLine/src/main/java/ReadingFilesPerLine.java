import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\dziekonskit\\Desktop\\Java\\New Text Document.txt";

        List<String> dejt = read(path);
        for (String i : dejt) {
            System.out.println(i);
        }
    }

    public static List<String> read(String file) throws IOException {

        List<String> data = new ArrayList<>();
        Files.lines(Paths.get(file)).forEach(line -> data.add(line));
        return data;

    }

}
