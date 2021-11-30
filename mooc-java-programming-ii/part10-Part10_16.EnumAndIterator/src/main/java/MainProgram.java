import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        Person i = new Person("Name", Education.HS);
        Person j = new Person("Other One", Education.BA);

        System.out.println(h);
        t.add(i);
        t.print();
        ArrayList <Person> list = new ArrayList<>();
        list.add(h);
        list.add(j);
        t.add(list);
        t.print();
        System.out.println("--------------------");
        t.print(Education.HS);
        System.out.println("--------------------");
        t.fire(Education.HS);
        t.print();
//        System.out.println(t);
//        t.fire(Education.PHD);
//        t.print();
    }
}
