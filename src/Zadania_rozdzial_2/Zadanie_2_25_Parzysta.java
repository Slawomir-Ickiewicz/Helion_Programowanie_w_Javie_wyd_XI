package Zadania_rozdzial_2;

import java.util.Scanner;

public class Zadanie_2_25_Parzysta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita :");
        int x = input.nextInt();
        if(x%2 == 0)
            System.out.print("liczba jest parzysta");
        else
            System.out.println("liczba jest nieparzysta");
    }
}
