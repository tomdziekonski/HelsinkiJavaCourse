import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements = new ArrayList<>();

    public SimpleCollection(String name) {
        this.name = name;
        
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (elements.isEmpty()) {
            return null;
        }
        String compare = "";
        for (String e : elements) {
            if (compare.length() < e.length()) {
                compare = e;
            }

        }
        return compare;
    }

}
