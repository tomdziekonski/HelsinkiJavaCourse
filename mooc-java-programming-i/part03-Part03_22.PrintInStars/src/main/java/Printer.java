public class Printer {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        int data = 0;

        for (int i = 0; i < array.length; i++) {
            data = array[i];
            System.out.println(" ");
            for (int stars = 0; stars < data; stars++) {
                System.out.print("*");

            }

        }

    }

    public static void stars(int cycle) {

    }

}
