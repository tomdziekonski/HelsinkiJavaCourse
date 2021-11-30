public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {

        Person compare = (Person) compared;
        int day = this.birthday.getDay();
        int month = this.birthday.getMonth();
        int year = this.birthday.getYear();
        int day2 = compare.birthday.getDay();
        int month2 = compare.birthday.getMonth();
        int year2 = compare.birthday.getYear();

        if (this.name.equals(compare.name) && this.height == compare.height
                && this.weight == compare.weight
                && day == day2 && month == month2 && year == year2) {
            return true;
        }
        return false;
    }

}
