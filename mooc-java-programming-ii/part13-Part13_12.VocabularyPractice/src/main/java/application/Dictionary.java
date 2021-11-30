package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Dictionary {

    private HashMap<String, String> dictionary;
    private HashMap<String, String> dictionary2;
    private ArrayList<String> list;

    public Dictionary() {
        this.dictionary = new HashMap<>();
        this.dictionary2 = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
            this.dictionary2.put(translation, word);
            this.list.add(word);
            this.list.add(translation);
        }
    }

    public String getTranslation(String word) {
        if (this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        
        return this.dictionary2.get(word);
    }

    public String getRandomizedWord() {
        Random randomizer = new Random();
        if (this.list.size() > 0) {
            return (this.list.get(randomizer.nextInt(list.size())));
        }
        
        else {
        return "No words added yet, add content to the dictionary !";
    }
}}
