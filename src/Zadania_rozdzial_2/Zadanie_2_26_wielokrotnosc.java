package Zadania_rozdzial_2;

import java.util.Scanner;

public class Zadanie_2_26_wielokrotnosc { //czy pierwsza liczba jest wielokrotnoscia drugiej
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe calkowita :");
        int x = input.nextInt();
        System.out.println("Podaj druga liczbe calkowita :");
        int y = input.nextInt();
        int wynikDzielenia = x/y;
        if(x%y == 0)
            System.out.print("liczba pierwsza jest wieloktornoscia drugiej");
        else
            System.out.println("liczba nie jest wielokrotnoscia drugiej");
    }
}
