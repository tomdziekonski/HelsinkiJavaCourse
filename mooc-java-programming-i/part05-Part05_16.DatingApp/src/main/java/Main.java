public class Main {

    public static void main(String[] args) {
        /*  SimpleDate test = new SimpleDate(1, 1, 2010);
        System.out.println(test);
        test.advance();
        System.out.println(test);
        System.out.println("");
        SimpleDate test2 = new SimpleDate(30, 1, 2010);
        System.out.println(test2);
        test2.advance();
        System.out.println(test2);
        System.out.println("");
        SimpleDate test3 = new SimpleDate(30, 12, 2010);
        System.out.println(test3);
        test3.advance();
        System.out.println(test3);
        System.out.println("");

        SimpleDate test = new SimpleDate(1, 1, 2010);
        System.out.println(test);
        test.advance(2);
        System.out.println(test);
        System.out.println("");

        SimpleDate test2 = new SimpleDate(30, 1, 2010);
        System.out.println(test2);
        test2.advance(1);
        System.out.println(test2);
        System.out.println("");

        SimpleDate test3 = new SimpleDate(30, 12, 2010);
        System.out.println(test3);
        test3.advance(1);
        System.out.println(test3);
        System.out.println("");

        SimpleDate test4 = new SimpleDate(30, 12, 2010);
        System.out.println(test4);
        test4.advance(19);
        System.out.println(test4);
        System.out.println("");*/
        
        SimpleDate date = new SimpleDate(13, 2, 2015);
    System.out.println("Friday of the examined week is " + date);

    SimpleDate newDate = date.afterNumberOfDays(7);
    int week = 1;
    while (week <= 7) {
        System.out.println("Friday after " + week + " weeks is " + newDate);
        newDate = newDate.afterNumberOfDays(7);

        week = week + 1;
    }
       // SimpleDate oldDate = new SimpleDate(1, 1, 2005);
       // SimpleDate newDate = oldDate.afterNumberOfDays(5);
       // System.out.println(newDate);
 SimpleDate date2 = new SimpleDate(13, 2, 2015);
    System.out.println("Friday of the examined week is " + date2);

    SimpleDate newDate2 = date.afterNumberOfDays(7);
     week = 1;
    while (week <= 7) {
        System.out.println("Friday after " + week + " weeks is " + newDate2);
        newDate = newDate2.afterNumberOfDays(7);

        week = week + 1;
    }
    }
}
