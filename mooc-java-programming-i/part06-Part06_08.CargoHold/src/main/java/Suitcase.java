import java.util.ArrayList;

public class Suitcase {

    private int maximum;
    private ArrayList<Item> list = new ArrayList<>();
    private int max = 0;

    public Suitcase(int max) {
        this.maximum = max;
    }

    public void addItem(Item item) {
        
        max = max + item.getWeight();
        if (max <= this.maximum) {
            list.add(item);
        }
    }

    public String toString() {
    int sum = 0;
    for (Item a: list) {
    sum = sum + a.getWeight(); 
    }
    int size = list.size();
    if (list.isEmpty()) {
    return "no items (0 kg)";
    }
    if (list.size() == 1) {
    return "1 item (" + sum + "kg)";
    }
    return Integer.toString(size) + " items (" + sum + "kg)";
    }
    
    public void printItems() {
    for (Item a: list) {
    System.out.println(a);
    }}
    
    public int totalWeight(){
    int sum = 0;
    for (Item a: list) {
    sum = sum + a.getWeight(); 
    }
    return  sum;
    }
    
    
    public Item heaviestItem() {
    Item sum = new Item ("a", 0);
    if (list.isEmpty()) {
    return null;
    }
    for (Item a: list) {
    if (a.getWeight() > sum.getWeight()) {
    sum = a; }
    else {continue;}
    }
         return sum; 
    
    
    }
}
