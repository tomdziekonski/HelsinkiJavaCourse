import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        Checker check = new Checker();
       
        
//        System.out.println("Enter a string:");
//        input = scan.nextLine();
//        if (check.isDayOfWeek(input) == true) {
//            System.out.println("The form is correct.");
//        } else {
//            System.out.println("The form is incorrect.");
//        }
//        
//        System.out.println("");
//        
        System.out.println("Enter a string:");
        input = scan.nextLine();
        if (check.allVowels(input) == true) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

//         System.out.println("");
//        
//        System.out.println("Enter a string:");
//        input = scan.nextLine();
//        if (check.timeOfDay(input) == true) {
//            System.out.println("The form is correct.");
//        } else {
//            System.out.println("The form is incorrect.");
//        }

    }

}
