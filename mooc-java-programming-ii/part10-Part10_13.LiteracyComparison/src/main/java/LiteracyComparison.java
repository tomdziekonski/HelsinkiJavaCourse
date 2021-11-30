import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
        ArrayList<Literacy> list = new ArrayList<>();
        File myObj = new File("literacy.csv");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] seperate = data.split(",");
            String trimmed = seperate[2];
            String[] sex = trimmed.split(" ");
            list.add(new Literacy(seperate[0], seperate[1], sex[1], seperate[3], Integer.valueOf(seperate[4]), Double.valueOf(seperate[5])));
        }
        
        Collections.sort(list);
        
        for (Literacy i: list) {
            System.out.println(i);
        }
}
     catch (Exception e) {
            System.out.println(e);
}

    
    }
   


}
