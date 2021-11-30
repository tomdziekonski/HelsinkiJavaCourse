import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet();

        names.add("one");
        names.add("one");
        names.add("two");
        names.add("three");
        names.add("nfw");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Set set) {
        return set.size();
    }

}
