public class Program {

    public static void main(String[] args) {
        Cube test = new Cube(7);
        test.volume();
        System.out.println(test);
        
        Cube c = new Cube(7);
        System.out.println(c.toString());
    }
}
