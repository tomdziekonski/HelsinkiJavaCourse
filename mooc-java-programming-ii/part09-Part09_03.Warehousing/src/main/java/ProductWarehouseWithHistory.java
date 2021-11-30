public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory hist;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.hist = new ChangeHistory();
        super.setBalance(initialBalance);
        this.hist.add(initialBalance);

    }

    public String history() {
        return this.hist.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + hist.toString());
        System.out.println("Largest amount of product: " + hist.maxValue());
        System.out.println("Smallest amount of product: " + hist.minValue());
        System.out.println("Average: " + hist.average());
    }

    public String toString() {
        return getName() + ": " + "balance " + "= " + getBalance() + ", " + "space left "
                + howMuchSpaceLeft();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        double result = super.getBalance();
        this.hist.add(result);

    }

    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        double result = super.getBalance();
        this.hist.add(result);
        return super.getBalance();

    }

}
