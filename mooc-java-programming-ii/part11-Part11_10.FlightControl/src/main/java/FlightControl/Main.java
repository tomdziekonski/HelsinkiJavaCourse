package FlightControl;

import java.util.Scanner;
import ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(scan);
        ui.start(scan);
    }
}
