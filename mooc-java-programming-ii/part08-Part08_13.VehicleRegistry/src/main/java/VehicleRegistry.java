import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> hash;

    public VehicleRegistry() {
        this.hash = new HashMap();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (hash.containsKey(licensePlate)) {
            return false;
        } else {
            hash.put(licensePlate, owner);
            return true;
        }

    }

    public String get(LicensePlate licensePlate) {
        if (!hash.containsKey(licensePlate)) {
            return null;
        }
        return hash.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!hash.containsKey(licensePlate)) {
            return false;
        }
        hash.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate i : this.hash.keySet()) {
            System.out.println(i);

        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String i : this.hash.values()) {
            if (!owners.contains(i)) {
                owners.add(i);
                System.out.println(i);
            }

        }

    }

}
