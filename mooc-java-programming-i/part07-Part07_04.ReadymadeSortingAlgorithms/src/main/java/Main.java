import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        String list[] = {"Commando", "Alien"};
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        Main.sort(list);
        System.out.println(Arrays.toString(list));
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        Main.sortIntegers(integers);
        System.out.println(integers);

        for (Integer i : integers) {
            System.out.print(i + " ");

        }
        System.out.println("");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Commando");
        strings.add("Alien");
        Main.sortStrings(strings);
        System.out.println(strings);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
