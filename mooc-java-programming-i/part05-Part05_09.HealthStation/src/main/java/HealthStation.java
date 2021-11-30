public class HealthStation {

    private int counter;

    public int weigh(Person person) {
        counter();
        return person.getWeight();

    }

    public void feed(Person person) {
        int feeder = person.getWeight();
        person.setWeight(feeder + 1);
    }

    public int counter() {
        return this.counter++;
    }

    public int weighings() {
        return this.counter;

    }
}
