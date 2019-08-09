package Chapter06.EX_6_18_PG321;

import java.util.Scanner;

public class SquareAsterisks {

    public static void squareOfAsterisks(int side) {


        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter side size ");
        int  side = input.nextInt();
        squareOfAsterisks(side);
    }
}
