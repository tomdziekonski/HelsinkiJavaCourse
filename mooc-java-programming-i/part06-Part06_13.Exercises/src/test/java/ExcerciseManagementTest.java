import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;


public class ExcerciseManagementTest {
private ExerciseManagement manager;
    
@Before
public void initialize() {
manager = new ExerciseManagement();
}
    
@Test

public void excerciseListEmptyAtBeginning() {
assertEquals(0, manager.exerciseList().size());
}
    
    
@Test
    
public void addingExerciseGrowsListByOne() {
manager.add("Write a test");
assertEquals(1, manager.exerciseList().size());
}
    
@Test
    
public void addedExerciseIsInList(){
manager.add("Write a test");
assertTrue(manager.exerciseList().contains("Write a test"));
}

@Test
public void exerciseCanBeMarkedAsCompleted(){
manager.add("New exercise");
manager.markAsCompleted("New exercise");
assertTrue(manager.isCompleted("New exercise"));
}

@Test
public void ifNotMarkedCompletedIsNotCompleted(){
manager.add("New exercise");
manager.markAsCompleted("New exercise");
assertFalse(manager.isCompleted("Some exercise"));
}
}

