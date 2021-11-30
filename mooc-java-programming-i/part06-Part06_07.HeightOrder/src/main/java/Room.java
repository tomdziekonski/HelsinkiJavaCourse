import java.util.ArrayList;
import java.util.Iterator;

public class Room {

    ArrayList<Person> list = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        if (list.isEmpty()) {
            return null;
        }
        int max = 999;
        String name = "";
        for (Person i : list) {
            if (i.getHeight() < max) {
                max = i.getHeight();

                name = i.getName();
            }
        }
        Person result = new Person(name, max);

        return result;
    }

    public Person take() {
        if (list.isEmpty()) {
            return null;
        } else {
            int max = 999;
            String name = "";
            for (Person i : list) {
                if (i.getHeight() < max) {
                    max = i.getHeight();

                    name = i.getName();
                }
            }
            Person result = new Person(name, max);

            for (Iterator<Person> it = list.iterator(); it.hasNext();) {
                Person next = it.next();
                if (next.getHeight() == max && next.getName() == name) {
                    it.remove();
                }
            }

            return result;
        }
    }

}
