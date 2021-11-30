public class Program {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("one", 1);
        System.out.println(pair.getKey() + " -> " + pair.getValue());
        HashMap test = new HashMap<>();
        test.add("keyz", "valuez");
        test.get("keyz");
    }

}
