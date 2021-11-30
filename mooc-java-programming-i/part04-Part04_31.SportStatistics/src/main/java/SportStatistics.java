import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = String.valueOf(scan.nextLine());
        System.out.println("Team:");
        String team = String.valueOf(scan.nextLine());
        int cycle = 0;
        String readOutput;
        int two;
        int three;
        int won = 0;
        int loss = 0;
        try (Scanner read = new Scanner(Paths.get(file))) {

            while (read.hasNextLine()) {
                readOutput = String.valueOf(read.nextLine());
                String[] list = readOutput.split(",");
                two = Integer.valueOf(list[2]);
                three = Integer.valueOf(list[3]);
                System.out.println(list[3]);
                
                if (Arrays.asList(list).contains(team)) {
                    cycle++;
                }
                if (list[0].equals(team) && (two > three)) {
                    won++;
                }
                if (list[1].equals(team) && (three > two)) {
                    won++;
                }
                if (list[0].equals(team) && (two < three)) {
                    loss++;
                }
                if (list[1].equals(team) && (three < two)) {
                    loss++;
                }

            }
        } catch (Exception error) {
            System.out.println(error);
        }
        System.out.println("Games: " + cycle);
        System.out.println("Wins: " + won);
        System.out.println("Losses: " + loss);

    }
}
