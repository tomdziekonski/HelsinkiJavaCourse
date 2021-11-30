
public class AdvancedAstrology {

    public static void printSpaces(int number) {
        int cycle = 1;
        while (cycle <= number) {
            System.out.print(" ");
            cycle++;

        }

        // part 1 of the exercise
    }

    public static void printStars(int number) {
        int cycle = 1;
//System.out.println("*");
        while (cycle <= number) {
            System.out.print("*");
            cycle++;

            // part 1 of the exercise
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        int cycle = 1;
        while (cycle <= size) {

            printSpaces(size - cycle);

            printStars(cycle);
            //System.out.println(" ");

            cycle++;
        }
    }

    public static void christmasTree(int height) {
        int cycle = 2;
        int data = 1;
        printSpaces(height - 1);
        printStars(1);

        while (cycle <= height) {
            printSpaces(height - cycle);
            data++;
            data++;
            printStars(data);
            cycle++;
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    //printSpaces(2);
    // part 2 of the exercise
    // part 3 of the exercise
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        //printStars(1);
        // printStars(5);
        //printSpaces(1);
        //System.out.println(" ");
        //printTriangle(4);
        //System.out.println("---");
        christmasTree(10);
        // System.out.println("---");
        // christmasTree(10);
    }
}
