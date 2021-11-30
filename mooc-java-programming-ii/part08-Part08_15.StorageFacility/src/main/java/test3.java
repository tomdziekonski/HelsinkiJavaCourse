import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers;

        while (true) {

            System.out.println("Provide numbers, 0 stops");
            numbers = String.valueOf(scan.nextLine());

            if (numbers.equals("0")) {
                break;
            }

            String[] splitter = numbers.split(",");
            int firstNumber = Integer.valueOf(splitter[0]);
            int secondNumber = Integer.valueOf(splitter[1]);

            int result = firstNumber * secondNumber;
            System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is " + result);
        }
    }
}
