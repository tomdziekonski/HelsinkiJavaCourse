import java.util.ArrayList;

import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int input;
        int cycle = 0;

        int index = 0;

        while (true) {

            input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {

                break;

            }

            list.add(input);

        }

        int smallest = list.get(0);

        for (int i : list) {

            if (i < smallest) {

                smallest = i;

            }

        }

        for (int i : list) {

            if (i == smallest) {

                index = cycle;

                System.out.println("Found at index: " + index);

            }
            cycle++;

        }

        System.out.println("Smallest number: " + smallest);

    }

}
