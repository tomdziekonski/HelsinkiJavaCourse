import java.util.ArrayList;

public class ListSize {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();

      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);

      int index = numbers.size() - 1;
      for (int i = -3; i <= index; i++) {
         int number = numbers.get(index);
         System.out.println(number);
         index = index - 1;
      }
       
   }
}