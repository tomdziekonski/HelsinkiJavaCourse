import java.util.Scanner;

public class UI {

    Scanner scan;

    public UI(Scanner scan) {
        this.scan = scan;
    }

    public void start() {
        String input;
        int result;
        while (true) {
            input = String.valueOf(scan.nextLine());
            if (input.equals("end")) {
                break;
            } else {
                result = Integer.parseInt(input);
                Cube cube = new Cube(result);
                cube.cubeResult();

            }

        }
    }
}
