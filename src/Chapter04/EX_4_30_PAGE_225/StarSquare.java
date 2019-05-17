package Chapter04.EX_4_30_PAGE_225;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        System.out.println("Enter square side size: ");
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();

        for (int i = 0; i < width - 1; i++) {
            System.out.print("* ");

        }
        System.out.println("*");


        for (int i = 0; i < width - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < width * 2 - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < width - 1; i++) {
            System.out.print("* ");

        }
        System.out.print("*");


    }
}
