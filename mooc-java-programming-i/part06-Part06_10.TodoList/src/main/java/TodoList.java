import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        if (list.isEmpty()) {
        System.out.println("The list is empty");
        }
        int cycle = 1;
        for (String i : list) {
            System.out.println(cycle + ": " + i);
            cycle++;
        }
    }

    public void remove(int number) {
        if (number == 0) {
            System.out.println("Task zero does not exist");
        }
        else {
        list.remove(list.get(number - 1));}
    }

}
