package ZAD_4_21_STR_222;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter 10 numbers");
            int najwieksza = input.nextInt();

        for (int counter = 0; counter <9 ; counter++) {
            int liczba = input.nextInt();
            if (liczba>najwieksza){
                najwieksza = liczba;
            }
        }
        System.out.println("Largest number is: "+najwieksza);
    }
}
