public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here

        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(2));
        MagicSquare square = new MagicSquare(2);
        square.placeValue(0, 0, 1);
        square.placeValue(0, 1, 2);
        square.placeValue(1, 0, 3);
        square.placeValue(1, 1, 4);
        System.out.println(square.sumsOfRows());
    }
}
