import java.util.ArrayList;

public abstract class Box {
private ArrayList <Item> list;

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            list.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
