public class Program {

    public static void main(String[] args) {

        Timer test2 = new Timer();
        while (true) {
    System.out.println(test2);
    test2.advance();

    try {
        Thread.sleep(10);
    } catch (Exception e) {

    }
}
    }
}
