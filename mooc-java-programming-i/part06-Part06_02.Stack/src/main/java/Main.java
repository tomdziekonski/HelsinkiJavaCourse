public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        System.out.println(""
        );
        Stack ss = new Stack();
        ss.add("1");
        ss.add("2");
        ss.add("3");
        ss.add("4");
        ss.add("5");

        while (!ss.isEmpty()) {
            System.out.println(ss.take());
        }
    }
}
