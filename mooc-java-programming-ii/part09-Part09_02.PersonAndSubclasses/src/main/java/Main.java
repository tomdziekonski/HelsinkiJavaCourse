import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        System.out.println(ada);
//        
//        System.out.println();
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        System.out.println("Study credits " + ollie.credits());
//        ollie.study();
//        System.out.println("Study credits " + ollie.credits());
//
//        Student john = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(john);
//        ollie.study();
//        System.out.println(john);
//        Teacher teach = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(esko);
//        System.out.println(teach);
//
        Student carl = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        int loop = 0;
//        while (loop < 25) {
//            carl.study();
//            loop++;
//        }
//        
        for (int i = 0; i < 25; i++) {
            carl.study();
        }
        System.out.println(carl);
//Student s = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028");
//System.out.print(s);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person i : persons) {
            System.out.println(i);
        }

    }

}
