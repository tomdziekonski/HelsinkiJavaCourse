import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> hash;

    public DictionaryOfManyTranslations() {
        this.hash = new HashMap<>();

    }

    public void add(String word, String translation) {
        ArrayList<String> store = new ArrayList<>();
        this.hash.putIfAbsent(word, store);
        store = this.hash.get(word);
        store.add(translation);

    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> list = new ArrayList<>();

        if (this.hash.get(word) == null) {
            hash.put(word, list);

            return list;
        }

        for (String i : this.hash.get(word)) {
            list.add(i);
        }
        return list;

    }

    public void remove(String word) {
        this.hash.remove(word);
    }
}
