public class ArrayPrinter {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

    }

    public static void printNeatly(int[] array) {
        int cycle = 0;
        while (cycle < array.length) {
            if (cycle == (array.length - 1)) {
                System.out.println(array[cycle]);
                break;
            }
            System.out.print(array[cycle] + "," + " ");

            cycle++;
        }

    }
}
