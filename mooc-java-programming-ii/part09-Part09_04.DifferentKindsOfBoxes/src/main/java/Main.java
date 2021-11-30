public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka" )));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak" )));

       //Item item1 = new Item("Name");
//        Item item2 = new Item("Name", 10);
//        coffeeBox.add(item1);
//        coffeeBox.add(item2);
//        System.out.println(coffeeBox.isInBox(item1));
//        System.out.println(coffeeBox.isInBox(item2));
        
//        MisplacingBox box = new MisplacingBox();
//        box.add(new Item("Saludo", 5));
//        box.add(new Item("Pirkka", 5));
//
//        System.out.println(box.isInBox(new Item("Saludo")));
//        System.out.println(box.isInBox(new Item("Pirkka")));

    }
}
