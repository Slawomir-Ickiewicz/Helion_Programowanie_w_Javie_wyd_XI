package Chapter06.EX_6_15_PG321;

import java.util.Scanner;

public class Hypotenuse {


    public static double hypotenuse(double a, double b) {

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = input.nextDouble();
        double result = hypotenuse(side1, side2);
        System.out.println("Hypotenuse of side " + side1 + " and side " + side2 + " is " + result);


    }
}
