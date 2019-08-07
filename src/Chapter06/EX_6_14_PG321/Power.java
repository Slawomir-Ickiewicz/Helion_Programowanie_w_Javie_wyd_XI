package Chapter06.EX_6_14_PG321;

import java.util.Scanner;

public class Power {

    public int integerPower(int base, int exponent) {
        int power = 0;
        int basiest = base;


        if (exponent == 0) {
            power = 1;
        }
        if (exponent == 1) {
            power = base;
        } else {
            for (int i = 0; i < exponent - 1; i++) {

                power = base * basiest;
                base = power;
            }
        }

        return power;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base for power: ");
        int base = input.nextInt();
        System.out.println("Enter exponent for power: ");
        int exponent = input.nextInt();
        Power pwr = new Power();
        System.out.println("Power of " + base + " to " + exponent + " is " + pwr.integerPower(base, exponent));

    }
}
