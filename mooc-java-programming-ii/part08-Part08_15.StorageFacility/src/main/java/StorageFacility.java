import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> store;

    public StorageFacility() {
        this.store = new HashMap<>();
    }

    public void add(String unit, String item) {
        ArrayList<String> items = new ArrayList<>();
        this.store.putIfAbsent(unit, items);
        items = this.store.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.store.get(storageUnit) == null) {
            this.store.put(storageUnit, new ArrayList());
            return this.store.get(storageUnit);
        }
        return this.store.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.store.get(storageUnit) == null) {
            this.store.remove(storageUnit);
        }
        for (String i : this.store.get(storageUnit)) {
            if (i.equals(item)) {

                this.store.get(storageUnit).remove(i);
                break;
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String i : this.store.keySet()) {
            if (!this.store.get(i).isEmpty()) {

                list.add(i);
            }

        }
        return list;

    }

}
