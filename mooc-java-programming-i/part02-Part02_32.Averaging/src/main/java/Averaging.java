public class Averaging {

    public static int sum(int number1, int number2, int number3, int number4) {
        int resultOfSum = (number1 + number2 + number3 + number4);
        return resultOfSum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double sum = sum(number1, number2, number3, number4);
        double resultOfAverage = (double) (sum / 4);
        return resultOfAverage;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
