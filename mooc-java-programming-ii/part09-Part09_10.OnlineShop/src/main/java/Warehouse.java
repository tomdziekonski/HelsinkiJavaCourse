import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> storage;
    private Map<String, Integer> stock;
    
    

    public Warehouse() {
        this.storage = new HashMap();
        this.stock = new HashMap();
     

    }

    public void addProduct(String product, int price, int stock) {
        this.storage.put(product, price);
        this.stock.put(product, stock);
    }

      
    public int price(String product) {
        if (!this.storage.keySet().contains(product)) {
            return -99;
        }
        return this.storage.get(product);
    }
    
    public int stock(String product) {
        if (!this.stock.keySet().contains(product)) {
            return 0;
        }
        return stock.get(product);
    }

    public boolean take(String product) {
        if (!this.stock.keySet().contains(product)) {
            return false;
        } else if (this.stock.get(product) > 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return this.stock.keySet();

    }
}
