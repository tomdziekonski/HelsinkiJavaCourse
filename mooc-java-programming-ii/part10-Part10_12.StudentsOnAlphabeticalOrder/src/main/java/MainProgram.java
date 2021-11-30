import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("zygmunt");
        Student second = new Student("adam");
        ArrayList <Student> list = new ArrayList<>();
        list.add(second);
        list.add(first);
        
        Collections.sort(list);
        System.out.println(list);
    }
}
