public class MainProgram {

    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        Organism one = new Organism (9, 9);
        herd.addToHerd(one);
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
    }
}