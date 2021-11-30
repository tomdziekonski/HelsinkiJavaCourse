public class Container {

    private int content;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return this.content;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.content += amount;
        }

        if (this.content > 100) {
            this.content = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.content -= amount;
        }

        if (this.content < 0) {
            this.content = 0;
        }

    }

    public String toString() {
        return contains() + "/100";
    }
}
