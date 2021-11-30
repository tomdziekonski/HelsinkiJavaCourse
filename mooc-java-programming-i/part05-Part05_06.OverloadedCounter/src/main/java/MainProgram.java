public class MainProgram {

    public static void main(String[] args) {
    Counter test = new Counter (5);
    test.decrease(2);
    System.out.println(test);
    test.increase();
    System.out.println(test);
    test.decrease();
    System.out.println(test);
    test.increase(2);
    System.out.println(test);
    test.decrease(-3);
    System.out.println(test);
    test.increase(-9);
    System.out.println(test);
    }
}
