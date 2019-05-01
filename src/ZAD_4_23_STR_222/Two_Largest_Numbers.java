package ZAD_4_23_STR_222;

import java.util.Scanner;




public class Two_Largest_Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int largest = 0;
        int secLargest = 0;

        for (int counter = 0; counter < 9; counter++) {
            int number = input.nextInt();
            if (number > largest) {
                secLargest = largest;
                largest = number;


            }
            else if (number > secLargest && number < largest) {
                secLargest = number;
            }
        }
        System.out.println("Largest number is: " + largest + "\n" + "Second largest is: " + secLargest);
    }
}
