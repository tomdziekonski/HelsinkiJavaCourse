public class Main {

    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherObject = new Song("Tytul", "Imie", 666);
        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals(anotherObject)) {
            System.out.println("Strange things are afoot.");
        }

    }
}
