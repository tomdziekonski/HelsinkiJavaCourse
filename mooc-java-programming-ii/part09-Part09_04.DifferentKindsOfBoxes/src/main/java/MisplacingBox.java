import java.util.ArrayList;

public class MisplacingBox extends Box {

private ArrayList <Item> list;    

    public MisplacingBox() {
    list = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
    list.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
    return false;
    }
}
