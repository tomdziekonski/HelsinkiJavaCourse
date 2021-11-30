import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        int[] numbersTwo = {-1, 6, 9, 8, 12};

        System.out.println(MainProgram.indexOfSmallestFrom(numbersTwo, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersTwo, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersTwo, 2));

        int[] numbersThree = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbersThree));
        MainProgram.swap(numbersThree, 1, 0);
        System.out.println(Arrays.toString(numbersThree));
        MainProgram.swap(numbersThree, 0, 3);
        System.out.println(Arrays.toString(numbersThree));

        int[] numbersFour = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbersFour);
    }

    public static int smallest(int[] array) {
        int max = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < max) {
                max = Integer.valueOf(i);
            }

        }
        return max;

    }

    public static int indexOfSmallest(int[] array) {
        int max = Integer.MAX_VALUE;
        int index = 0;
        int indexFinal = 0;

        for (int i : array) {
            if (i < max) {
                max = Integer.valueOf(i);
                indexFinal = index;
            }
            index++;
        }
        return indexFinal;

    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int max = Integer.MAX_VALUE;
        int index = 0;
        int indexFinal = 0;

        for (int i : array) {
            if (i < max && index >= startIndex) {
                max = Integer.valueOf(i);
                indexFinal = index;
            }

            index++;
        }
        return indexFinal;
    }

    public static void swap(int[] array, int index1, int index2) {

        int first = array[index1];

        array[index1] = array[index2];
        array[index2] = first;
    }

    public static void sort(int[] array) {
        int holder = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            holder = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, holder);
        }
    }
}
