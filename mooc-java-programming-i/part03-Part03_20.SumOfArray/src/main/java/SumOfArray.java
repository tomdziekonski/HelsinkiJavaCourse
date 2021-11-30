public class SumOfArray {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};

        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int cycle = 0;
        int data = 0;
        int sum = 0;
        while (cycle < array.length) {
            data = array[cycle];
            sum = sum + data;
            cycle++;
        }

        return sum;
    }
}
