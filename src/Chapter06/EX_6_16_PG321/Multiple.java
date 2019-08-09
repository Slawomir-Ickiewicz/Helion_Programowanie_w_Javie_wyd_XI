package Chapter06.EX_6_16_PG321;

import java.util.Scanner;

public class Multiple {

    public static boolean isMultiple(int a, int b) {
        boolean result = true;

        if (a % b == 0) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number to check if it is multiple of first number: ");
        int b = input.nextInt();
        boolean result = isMultiple(a, b);

        if (result == true){
            System.out.println(+b+" is multiple of "+a);

        }
        else {
            System.out.println(+b+" is not multiple of "+a);
        }


    }
}

