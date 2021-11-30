package ui;

import domain.Airplane;
import domain.Flight;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private ArrayList<Airplane> planes = new ArrayList<>();
    private ArrayList<Flight> flights = new ArrayList<>();

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.scan = new Scanner(System.in);

    }

    public void start(Scanner scan) {
        String input = "";
        String input2 = "";
        String input3 = "";

        while (true) {
            System.out.println("Airport Asset Control:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            input = scan.nextLine();

            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Give the airplane id:");
                input = scan.nextLine();
                
                System.out.println("Give the airplane capacity:");
                input2 = scan.nextLine();
                this.planes.add(new Airplane(input, Integer.valueOf(input2)));

            } else if (input.equals("2")) {
                System.out.println("Give the airplane id:");
                input = scan.nextLine();
                System.out.println("Give the departure airport id:");
                input2 = scan.nextLine();
                System.out.println("Give the target airport id: ");
                input3 = scan.nextLine();

                for (Airplane i : this.planes) {
                    if (i.getId().equals(input)) {
                        this.flights.add(new Flight(i, input2, input3));
                    }
                    System.out.println("Wrong input data, Airplane id not found");
                }

            } 
            else {
                System.out.println("Wrong command, try again");
            }
        }

        while (true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            input = scan.nextLine();
            if (input.equals("1")) {
                for (Airplane i : this.planes) {
                    System.out.println(i);
                }

            } else if (input.equals("2")) {
                for (Flight i : this.flights) {
                    System.out.println(i);
                }
            } else if (input.equals("3")) {
                System.out.println("Give the airplane id:");
                input = scan.nextLine();
                for (Airplane airplane : this.planes){
                    if (airplane.getId().equals(input)){
                        System.out.println(airplane);
                    }
             
                }

            } else if (input.equals("x")) {
                break;
            } 
            else {
                System.out.println("Wrong command, try again");
            }
        }
    }

}
