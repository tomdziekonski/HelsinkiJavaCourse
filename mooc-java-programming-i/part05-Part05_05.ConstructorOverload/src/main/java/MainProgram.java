public class MainProgram {

    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
        tyre.increase();
        System.out.println(tyre);
        tyre.increase2();
        System.out.println(tyre);
    }
}

