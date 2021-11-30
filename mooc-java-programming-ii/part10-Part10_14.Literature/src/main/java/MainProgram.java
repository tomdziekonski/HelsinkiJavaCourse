import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        String age;

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation:");
            age = scanner.nextLine();

            if (age.equals("")) {
                break;
            }

            bookList.add(new Book(name, Integer.valueOf(age)));
            System.out.println("");
        }

        Comparator<Book> compare = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(bookList, compare.reversed());

        System.out.println(bookList.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        for (Book i : bookList) {
            System.out.println(i);
        }

    }

}
