package Chapter06.EX_6_17_PG321;

import java.util.Scanner;

public class Even {

    public static boolean isEven(int a) {
        boolean even = true;

        if (a % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to check if it is even or enter -1 to exit : ");
        int number = input.nextInt();

        while (number != -1) {
            boolean werdict = isEven(number);
            if (werdict == true) {
                System.out.println(+number + " is even");
            } else {
                System.out.println(+number + " is odd");
            }
            System.out.println("Please enter number to check if it is even or enter -1 to exit: ");
            number = input.nextInt();
        }


    }
}
