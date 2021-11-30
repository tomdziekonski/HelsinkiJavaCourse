import java.util.Scanner;

public class divide {


    public void run(Scanner scan) {
        System.out.println("Enter the number");
        int number;
        number = Integer.valueOf(scan.nextLine());
        System.out.println(process(number));
    }
    
    public String process(int number){
        if (number % 3 == 0 && number % 5 == 0) {
         return "divided by five and three";
        }
        
        else if (number % 3 == 0) {
            return "divided by three";
        }
        
        else if (number % 5 == 0) {
            return "divided by five";
        }
        return String.valueOf(number);
    }
    
}
