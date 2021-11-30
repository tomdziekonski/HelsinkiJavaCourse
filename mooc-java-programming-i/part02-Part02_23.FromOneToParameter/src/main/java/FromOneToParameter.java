public class FromOneToParameter {

    public static void main(String[] args) {

        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int loop = 0;
        while (loop < number) {
            loop++;
            System.out.println(loop);
        }
    }
}
