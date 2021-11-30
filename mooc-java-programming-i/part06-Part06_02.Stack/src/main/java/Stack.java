import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {
        String result = list.remove(list.size() - 1);
        return result;
    }
}
