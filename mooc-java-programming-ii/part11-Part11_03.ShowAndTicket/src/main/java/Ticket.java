import java.util.ArrayList;

public class Ticket {
    private int seat;
    private int code;
    private Show movies;
    private ArrayList<Show> list = new ArrayList<>();
    
    public void add(Show show){
        list.add(show);
    }
    
    public void print(){
      for (Show i: list){
          System.out.println(i);
      }
    }
    
    public int size(){
        return list.size();
    }

    
}
