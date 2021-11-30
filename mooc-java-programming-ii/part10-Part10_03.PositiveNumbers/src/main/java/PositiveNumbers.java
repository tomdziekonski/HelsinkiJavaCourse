import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-1);
        list.add(0);
        list.add(9);
        System.out.println(positive(list));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> result = numbers.stream().filter(number -> number > 0).collect(Collectors.toCollection(ArrayList::new));
        return result;
    }

}
