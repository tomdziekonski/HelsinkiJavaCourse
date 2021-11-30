import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> list;

    public Employees() {
        list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person i : peopleToAdd) {
            list.add(i);
        }
    }

    public void print() {
        Iterator<Person> iterate = list.iterator();

        while (iterate.hasNext()) {
            Person result = iterate.next();
            if (list.size() < 1) {
                break;
            } else {
                System.out.println(result);
            }
        }
    }

    public void print(Education education) {
        Iterator<Person> iterate = list.iterator();

        while (iterate.hasNext()) {
            Person result = iterate.next();
            if (result.getEducation().equals(education)) {

                System.out.println(result);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterate = list.iterator();

        while (iterate.hasNext()) {
            Person result = iterate.next();
            if (result.getEducation().equals(education)) {
                iterate.remove();
            }
        }

//        iterate.forEachRemaining(test -> {
//            if (test.getEducation().equals(education)&& list.size() > 0) {
//                iterate.remove();
//            }
//        });
    }
}
