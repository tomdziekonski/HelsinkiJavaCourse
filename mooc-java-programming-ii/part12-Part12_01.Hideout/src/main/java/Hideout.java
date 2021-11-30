import java.util.ArrayList;

public class Hideout<T> {

    private T test;
    private ArrayList<T> list;

    public Hideout() {
        list = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        test = toHide;
        if (!list.contains(toHide)) {
            list.add(toHide);
        } else {
            list.remove(toHide);
        }
    }

    public T takeFromHideout() {
        if (list.size()>0) {
            list.remove(this.test);
            return this.test;
        }

        return null;
    }

    public boolean isInHideout() {
        if (this.list.contains(this.test)) {
            return true;
        }

        return false;

    }
}
