import org.junit.Assert;
import org.junit.Test;

public class divideTest {
    

   
    divide test = new divide();
    
     

    @Test
    public void divideTest() {
       

        Assert.assertEquals("2", test.process(2));
        Assert.assertEquals("1", test.process(1));
        Assert.assertEquals("divided by three", test.process(3));
        Assert.assertEquals("divided by five", test.process(5));
        Assert.assertEquals("divided by five and three", test.process(15));

    }

}
