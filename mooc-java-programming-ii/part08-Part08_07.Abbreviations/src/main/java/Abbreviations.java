import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> hash;

    public Abbreviations() {
        this.hash = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.hash.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.hash.containsKey(abbreviation)) {
            return true;

        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (this.hash.containsKey(abbreviation)) {
            return this.hash.get(abbreviation);
        }
        return null;
    }

}
