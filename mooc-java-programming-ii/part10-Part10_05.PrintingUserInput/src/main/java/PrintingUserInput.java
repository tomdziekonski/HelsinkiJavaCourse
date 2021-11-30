import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        ArrayList<String> data = new ArrayList<>();
        
        while (true) {
            System.out.println("Input data, press enter to stop");
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            data.add(input);
            
        }
        
        data.stream().forEach(result -> System.out.println(result));
    }
}
