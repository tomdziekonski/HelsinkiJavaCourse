import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        Statistics statScan = new Statistics();
        Statistics statEven = new Statistics();
        Statistics statOdd = new Statistics();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                statScan.addNumber(input);
                statEven.addNumber(input);

            }
            if (input % 2 != 0) {
                statScan.addNumber(input);
                statOdd.addNumber(input);

            }

        }
        System.out.println("Sum: " + statScan.sum());
        System.out.println("Sum of even numbers: " + statEven.sum());
        System.out.println("Sum of odd numbers: " + statOdd.sum());

     //   Statistics statistics = new Statistics();
      //  statistics.addNumber(3);
      //  statistics.addNumber(5);
      //  statistics.addNumber(1);
     //   statistics.addNumber(2);
       // System.out.println("Count: " + statistics.getCount());
      //  System.out.println("Sum: " + statistics.sum());
      //  System.out.println("Average: " + statistics.average());

        //    int result = Integer.valueOf(scanner.nextLine());
        //   while (result !=-1) {
        //         statistics.addNumber(result);
        //    if (result ==-1)
        //       break;
        //    }
        // System.out.println("Sum from scanner: " + statistics.sum());
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
