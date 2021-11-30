import java.util.Random;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        randomizer(scanner);
    }
    
    public static void randomizer(Scanner scan) {
        System.out.println("How many random numbers should be printed?");
        String input = scan.nextLine();
        Random randomize = new Random();
        
        for (int i = 0; i < Integer.valueOf(input); i++) {
            System.out.println(randomize.nextInt(10));
        }
    }
    
}
