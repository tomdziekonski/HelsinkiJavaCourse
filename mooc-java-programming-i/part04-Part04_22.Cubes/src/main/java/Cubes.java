import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int cube;
        while (true) {
            input = String.valueOf(scanner.nextLine());
            if (input.equals("end")) {
                break;
            }
            cube = Integer.valueOf(input);
            cube = cube * cube * cube;
            System.out.println(cube);
        }
    }
}
