//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Film Batman = new Film ("Batman", 18);
      //  Scanner scan = new Scanner (System.in);
        
     //   System.out.println("How old are you ?");
       // int age = Integer.valueOf(scan.nextLine());
       int age = Batman.ageRating();
        
        if (age < 18) {
            System.out.println("You are not allowed to watch " + Batman.name()); }
        
            else  {
            System.out.println("You are allowed to watch " + Batman.name());    
                    }
        }
    }

