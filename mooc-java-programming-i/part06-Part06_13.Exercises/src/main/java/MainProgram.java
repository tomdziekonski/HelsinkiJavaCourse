public class MainProgram {

    public static void main(String[] args) {

        ExerciseManagement manager = new ExerciseManagement();
        manager.add("New exercise");
        manager.markAsCompleted("New exercise");
        manager.isCompleted("New exercise");

    }

    public static int partsCompleted() {
        return 2;
    }
}
