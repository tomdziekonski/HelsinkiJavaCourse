import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        String input2;
        String input3;
        while (true) {
            System.out.println("First name: ");
            input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            input2 = String.valueOf(scanner.nextLine());
            System.out.println("Identification number: ");
            input3 = String.valueOf(scanner.nextLine());
            infoCollection.add(new PersonalInformation(input, input2, input3));

        }

       for (PersonalInformation test2 : infoCollection) {
         System.out.print(test2.getFirstName() + " " + test2.getLastName());
          System.out.println("");

            
       }
    for (int i = 0; i <infoCollection.size(); i++) {
          System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
         System.out.println(" ");
       }
        System.out.println(infoCollection.size());
    }}
