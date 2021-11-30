package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> Finnish = new HashMap<>();
    private HashMap<String, String> English = new HashMap<>();
    private String text;

    public SaveableDictionary(String file) {
        this.text = file;
    }

    public SaveableDictionary() {
    }

    public boolean load() {
        File files = new File(this.text);
        try {
            if (files.exists()) {
                Scanner fileReader = new Scanner(files);
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    String[] parts = line.split(":");
                    this.English.put(parts[1], parts[0]);
                    this.Finnish.put(parts[0], parts[1]);
                }
                return true;

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean save() {
        try {
            PrintWriter write = new PrintWriter(this.text);
            File files = new File(this.text);

            if (files.exists()) {
                Scanner fileReader = new Scanner(files);
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    String[] parts = line.split(":");
                    this.English.put(parts[1], parts[0]);
                    this.Finnish.put(parts[0], parts[1]);
                }
            }

            for (String i : this.English.keySet()) {
                String translation = this.English.get(i);
                write.println(i + ":" + translation);
            }
            write.close();

            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void add(String words, String translation) {
        if (!this.English.containsKey(words)) {
            this.English.put(words, translation);
            this.Finnish.put(translation, words);
        }
    }

    public void delete(String word) {
        if (this.English.containsKey(word)) {
            this.English.remove(word);
        }

        if (this.Finnish.containsKey(word)) {
            this.Finnish.remove(word);
        }

        for (String i : this.Finnish.keySet()) {

            if (this.Finnish.get(i).equals(word)) {
                this.Finnish.remove(i);
                break;
            }
        }

        for (String i : this.English.keySet()) {

            if (this.English.get(i).equals(word)) {
                this.English.remove(i);
                break;
            }
        }
    }

    public String translate(String word) {
        if (this.English.containsKey(word)) {
            return this.English.get(word);
        } else if (this.Finnish.containsKey(word)) {
            return this.Finnish.get(word);

        }
        return null;
    }
}
