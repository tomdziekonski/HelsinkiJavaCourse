public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

     public static void printSpaces (int number) {
        int cycle = 1;

        while (number >= cycle) {
            cycle++;
            System.out.print(" ");

        }
        // first part of the exercise
    }

     
    
    public static void printStars(int number) {
        printSpaces(1);
        int cycle = 1;

        while (number >= cycle) {
            cycle++;
            System.out.print("*");

        }

        System.out.println("");
        // first part of the exercise
    }

    public static void printSquare(int size) {
        int cycle = 1;
        while (size >= cycle) {
            cycle++;
            printStars(size);
        }
        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        int cycle = 1;
        while (cycle <= height) {
            printStars(width);
            //System.out.println("");
            cycle++;
        }

        // third part of the exercise
    }

    public static void printTriangle(int size) {
        int cycle = 1;
        while (cycle <= size) {
            printStars(cycle);
            cycle++;
        }
        // fourth part of the exercise
    }
}
