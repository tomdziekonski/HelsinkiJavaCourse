import java.util.ArrayList;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstNumber;
        int secondNumber;
            while (true) {
            
            System.out.println("Provide the first number, 0 stops");
            firstNumber = Integer.valueOf(scan.nextLine());
            
            if (firstNumber == 0) {
                break;
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(firstNumber);
            System.out.println("Provide the second number");
            secondNumber = Integer.valueOf(scan.nextLine());
            list.add(secondNumber);
            
           
        
         int result = list.get(0) * list.get(1);
            System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is " + result);
    }
}}
