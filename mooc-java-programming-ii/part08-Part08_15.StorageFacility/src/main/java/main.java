
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//        divide test = new divide();
//        Scanner scan = new Scanner(System.in);
//       // System.out.println(test.process(5));
//       test.run(scan);
       
       
        try {
        int number;
        number = 5/0;
            System.out.println(number);
        }
        catch (Exception e) {
            System.out.println("bad");
        }
    }
}
