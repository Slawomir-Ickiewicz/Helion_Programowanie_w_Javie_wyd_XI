package Zadania_rozdzial_2;

import java.util.Scanner;

public class Zadanie_2_33_Kalkulator_Bmi {
    public static void main(String[] args) {
        System.out.println("Podaj wage w kilogramach ");
        Scanner inputWaga = new Scanner(System.in);
        int waga = inputWaga.nextInt();

        System.out.println("Podaj swoj wzrost w centymetrach ");
        Scanner inputWzrost = new Scanner(System.in);
        double wzrost = inputWzrost.nextDouble();

        double bmi;
        bmi = waga/(Math.pow((wzrost/100),2));

        System.out.println("Twoje BMI wynosi "+bmi);
    }
}
