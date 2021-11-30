import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        double pass = 0;
        System.out.println("Enter point totals, -1 stops:");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        int grade = 0;
        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        while (true) {
            input = scanner.nextLine();
            grade = Integer.valueOf(input);
            if (grade == -1) {
                break;
            }
            if ((grade > -1) && (grade < 101)) {
                list.add(grade);
            }

            if ((grade > 49) && (grade < 101)) {
                grades.add(grade);
            }

        }

        for (int i : list) {

            sum += i;
        }
        System.out.println("Point average (all): " + sum / list.size());

        for (int i : grades) {
            pass += i;
        }
        if (grades.isEmpty()) {
            System.out.println("Point average (passing):-");
        } else {
            System.out.println("Point average (passing):" + pass / grades.size());
        }
        if (grades.isEmpty()) {
            System.out.println("Pass percentage: 0.0");

        } else {
            System.out.println("Pass percentage:" + (double) 100 * grades.size() / list.size());
        }

        System.out.println("Grade distribution:");
        for (int i : list) {
            if (i < 50) {
                zero += "*";

            }
            if (i > 49 && i < 60) {
                one += "*";
            }

            if (i > 59 && i < 70) {
                two += "*";
            }

            if (i > 69 && i < 80) {
                three += "*";
            }

            if (i > 79 && i < 90) {
                four += "*";
            }
            if (i >= 90) {
                five += "*";
            }
        }
        System.out.println("5:" + five);
        System.out.println("4:" + four);
        System.out.println("3:" + three);
        System.out.println("2:" + two);
        System.out.println("1:" + one);
        System.out.println("0:" + zero);

    }

}
