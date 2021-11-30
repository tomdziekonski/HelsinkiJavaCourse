import java.util.Scanner;
import java.util.ArrayList;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = "";
        ArrayList<String> list = new ArrayList<>();
        data = String.valueOf(scanner.nextLine());
        for (int i = 0; (!data.equals("")); i++) {
            
            if (data.equals("")) {
                break;
            } else {
               list.add(data);

            }
            data = String.valueOf(scanner.nextLine());

        }
        System.out.println(list);
        list = list.split(" ");
      

    }
}
