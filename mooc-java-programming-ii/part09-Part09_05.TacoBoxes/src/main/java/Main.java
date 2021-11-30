public class Main {

    public static void main(String[] args) {
        CustomTacoBox box = new CustomTacoBox(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(box.tacosRemaining());
            box.eat();

        }
       
    }
}
