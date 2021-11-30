import java.util.ArrayList;

public class ExerciseManagement {
private ArrayList <Exercise> exercises;

public ExerciseManagement() {
this.exercises = new ArrayList();

}

public ArrayList <String> exerciseList() {
ArrayList <String> list = new ArrayList<>();
for (Exercise i: exercises) {
list.add(i.getName());
}
return list;
}

public void add(String excercise) {
exercises.add(new Exercise(excercise));
}

public void markAsCompleted (String exercise){
for (Exercise ex: exercises) {
if (ex.getName().equals(exercise)) {
ex.setCompleted(true);
}
}
}


public boolean isCompleted (String exercise){
for (Exercise ex: exercises) {
if (!ex.getName().equals(exercise)) {
ex.setCompleted(false);
return false;
}
}
return true;
}

}
