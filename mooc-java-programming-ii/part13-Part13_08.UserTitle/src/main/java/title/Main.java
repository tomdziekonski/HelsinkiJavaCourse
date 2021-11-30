package title;

import java.util.Scanner;
import static javafx.application.Application.launch;

public class Main {

    public static void main(String[] args) {
        System.out.println("Provide the application title");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        launch(UserTitle.class, "--titles=" + input);
    }
}
