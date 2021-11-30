import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> list;

    public OneItemBox() {
        list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (list.isEmpty()) {
            list.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        if (list.contains(item)) {
            return true;
        }
        return false;
    }
}
