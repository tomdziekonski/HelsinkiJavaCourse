package dictionary;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.load();
        System.out.println(s.translate("olut"));
        s.save();
    }
}
