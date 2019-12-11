package Chapter07.EX_7_18_PG386;

import java.io.IOException;
import java.security.SecureRandom;


public class Craps2 {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {
        CONTINUE,
        WON,
        LOST
    }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) throws IOException {

        int myPoint = 0;
        int numberOfAllGames = 1000000;
        int[] win = new int[22];
        int[] lost = new int[22];
        int averageGame = 0;
        int winCount = 0;
        int lostCount = 0;

        int totalRollcount = 0;

        Status gameStatus;

        for (int i = 0; i < numberOfAllGames; i++) {
            int rollCount = 0;

            int sumOfDice = rollDice();
            rollCount++;


            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;

                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;

                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    //  System.out.printf("Point is  %d%n", myPoint);
                    break;
            }
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                rollCount++;

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }

            if (rollCount > 20) {
                rollCount = 21;
            }

            if (gameStatus == Status.WON) {

                winCount++;
                win[rollCount]++;

            } else {

                lostCount++;
                lost[rollCount]++;

            }

            totalRollcount = totalRollcount + rollCount;

            averageGame = totalRollcount / numberOfAllGames;
        }
        System.out.printf("%s%8s%n", "Lost_in_roll_no ", " Total rolls when lost");

        for (int i = 1; i < lost.length; i++) {

            if (i <= 20) {
                System.out.printf("%5d%17d%n", i, lost[i]);
            } else {
                System.out.printf("%5s%17d%n", "21+", lost[i]);
            }
        }

        System.out.println();

        System.out.printf("%s%8s%n", "Won_in_roll_no ", " Total rolls when won");

        for (int i = 1; i < win.length; i++) {

            if (i <= 20) {
                System.out.printf("%5d%17d%n", i, win[i]);
            } else {
                System.out.printf("%5s%17d%n", "21+", win[i]);
            }
        }
        System.out.println();

        int wonPercent = (winCount / 10000);

        System.out.println("Total rolls in all iterations : " + totalRollcount);
        System.out.println("Average rolls per game: " + averageGame);
        System.out.println("Won percentage is: " + wonPercent + "%");
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        // System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
