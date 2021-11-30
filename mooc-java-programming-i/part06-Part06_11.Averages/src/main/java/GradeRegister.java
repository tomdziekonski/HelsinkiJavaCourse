import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        int sum = 0;
        if (grades.isEmpty()) {
            return -1;
        }
        for (Integer i : grades) {
            sum = sum + i;
        }
        return sum / (double) grades.size();
    }

    public double averageOfPoints() {
        int sum = 0;
        if (points.isEmpty()) {
            return -1;
        }
        for (Integer i : points) {
            sum = sum + i;
        }
        return sum / (double) points.size();
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

}
