import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the book inputs");
        System.out.println("Proivde the book name");
        String bookName = scanner.nextLine();
        System.out.println("Provide the book author");
        String bookAuthor = scanner.nextLine();
        System.out.println("Provide the page count");
        int pages = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Provide the plane inputs");
        System.out.println("Proivde the plane id");
        String planeId = scanner.nextLine();
        System.out.println("Provide the plane model");
        String planeModel = scanner.nextLine();
        System.out.println("Provide the plane year");
        int planeYear = Integer.valueOf(scanner.nextLine());
        
        Book book = new Book(bookName, bookAuthor, pages);
        Plane plane = new Plane(planeId, planeModel, planeYear);
        System.out.println(book);
        System.out.println(plane);
    }
}
