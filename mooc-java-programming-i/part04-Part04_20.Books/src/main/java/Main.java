import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String scanTitle;
        int scanPages;
        int scanYear;
        String print;
        while (true) {
            System.out.println("Title: ");
            scanTitle = String.valueOf(scan.nextLine());
            if (scanTitle.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            scanPages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            scanYear = Integer.valueOf(scan.nextLine());
            array.add(new Book(scanTitle, scanPages, scanYear));
        }
        System.out.println("What information will be printed?");
        print = String.valueOf(scan.nextLine());
        if (print.equals("everything")) {
            for (Book scanAll : array) {
                System.out.println(scanAll);

            }
        }
        if (print.equals("name")) {
            for (Book scanAll : array) {
                System.out.println(scanAll.returnTitle());
            }

        }
    }
}
