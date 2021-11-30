public class Program {

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }

        if (toWhere < 0) {
            toWhere = 0;
        }

        if (toWhere > array.length) {
            toWhere = array.length - 1;
        }

        if (fromWhere > array.length) {
            fromWhere = array.length - 1;
        }

        int sum = 0;
        int counter = 0;
        
        for (int i : array) {
            if (counter >= fromWhere && counter <= toWhere) {
                if (i >= smallest && i <= largest) {
                    sum = sum + i;
                }
            }

            counter++;
        }
        return sum;
    }

}
