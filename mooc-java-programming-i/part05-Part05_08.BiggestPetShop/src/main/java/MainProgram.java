import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
    }
}
