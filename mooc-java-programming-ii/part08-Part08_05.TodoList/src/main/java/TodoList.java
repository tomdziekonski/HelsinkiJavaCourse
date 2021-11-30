import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list = new ArrayList<>();

    public TodoList() {

    }

    public void add(String task) {
        list.add(task);
    }

    public int getList() {
        return list.size();
    }

    public void print() {
        int cycle = 1;

        for (String i : list) {
            System.out.println(cycle + ": " + i);
            cycle++;
        }
    }

    public void remove(int number) {
        list.remove(number - 1);
    }

}
