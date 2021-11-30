import java.util.ArrayList;

public class Package {

  
    private ArrayList<Gift> gifts =  new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
       
        gifts.add(gift);
        

    }

    public int totalWeight() {
        int sum = 0;
        for (Gift a : gifts) {
            sum = sum + a.getWeight();
        }
        return sum;
    }
}
