package Chapter06.EX_6_19_PG322;

import java.util.Scanner;

public class SquareAsterisks2 {

    public static void squareOfAsterisks(int side, char fillCharacter) {

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side size ");
        int side = input.nextInt();
        System.out.println("Enter character to square be filled in ");
        char fillChar = input.next().charAt(0);

        squareOfAsterisks(side, fillChar);
    }
}
