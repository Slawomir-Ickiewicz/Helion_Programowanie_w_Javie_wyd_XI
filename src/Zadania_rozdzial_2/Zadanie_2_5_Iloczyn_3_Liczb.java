package Zadania_rozdzial_2;

import java.util.Scanner;

public class Zadanie_2_5_Iloczyn_3_Liczb {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj piersza liczbe do iloczynu: ");
        int x = input.nextInt();

        System.out.println("Podaj druga liczbe do iloczynu: ");
        int y = input.nextInt();

        System.out.println("Podaj trzecia liczbe do iloczynu: ");
        int z = input.nextInt();

        int iloczyn = x*y*z;

        System.out.printf("iloczyn wynosi %d%n", iloczyn);

    }
}
