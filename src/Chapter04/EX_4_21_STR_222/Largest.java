package Chapter04.EX_4_21_STR_222;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int largest = 0;


        for (int counter = 0; counter < 9; counter++) {
            int number = input.nextInt();
            if (number > largest) {
                largest = number;


            }
        }
        System.out.println("Largest number is: " + largest);
    }
}
