import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> list;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();

    }
    
    @Override
    public void add(Item item) {
    if (this.capacity - item.getWeight() >= 0) {
        list.add(item);}
    this.capacity = this.capacity - item.getWeight();
    if (item.getWeight() == 0) {
    list.add(item);
    }
    }

    @Override
    public boolean isInBox(Item item) {
        if (list.contains(item)) {
            return true;
        }
        return false;
    }}
