public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int price;
        int price2;
        price = this.princePerSquare * this.squares;
        price2 = compared.princePerSquare * compared.squares;
        int difference;
        if (price > price2) {
            difference = price - price2;
        } else {
            difference = price2 - price;
        }
        return difference;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int price2 = compared.princePerSquare * compared.squares;
        if (price > price2) {
            return true;
        }
        return false;
    }
}
