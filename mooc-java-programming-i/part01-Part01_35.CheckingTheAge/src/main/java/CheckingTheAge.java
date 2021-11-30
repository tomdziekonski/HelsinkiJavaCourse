/*import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int wiek = Integer.valueOf(scan.nextLine());
        if (wiek >= 0 && wiek <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}*/

import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe od 0-100:");
        int liczba = Integer.valueOf(scan.nextLine());
        System.out.println(liczba);
        if (liczba % 3 == 0 && liczba % 5 == 0) {System.out.println("podzielna przez trzy i piec");}
        else if (liczba % 3 == 0) {System.out.println("podzielna przez trzy");}
        else if (liczba % 5 == 0) {System.out.println("podzielna przez piec");}
      
        
    }}
