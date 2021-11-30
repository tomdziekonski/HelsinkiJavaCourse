import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Integer> list;

    public Student(String name, String address) {
        super(name, address);
        list = new ArrayList<>();
    }

    public void study() {
        list.add(1);
    }

    public int credits() {
        return list.size();
    }

    public String toString() {

        return getName() + "\n" + " " + " " + getAddress() + "\n" + " " + " "
                + "Study credits " + (credits());
    }
}
