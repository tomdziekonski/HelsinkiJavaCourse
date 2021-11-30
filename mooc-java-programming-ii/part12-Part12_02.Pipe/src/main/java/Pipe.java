import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> list;

    public Pipe() {
        list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.list.add(value);
    }

    public T takeFromPipe() {
        if (list.isEmpty()) {
            return null;
        }
        T content = list.get(0);
        list.remove(list.get(0));
        return content;
    }

    public boolean isInPipe() {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
