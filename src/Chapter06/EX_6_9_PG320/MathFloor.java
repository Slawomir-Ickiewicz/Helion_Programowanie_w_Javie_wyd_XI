package Chapter06.EX_6_9_PG320;

import java.util.Scanner;

public class MathFloor {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        double x = input.nextDouble();
        double y = Math.floor(x + 0.5);
        System.out.println("Number before rounding  " + x);
        System.out.println("Number after rounding is " + y);
    }
}
