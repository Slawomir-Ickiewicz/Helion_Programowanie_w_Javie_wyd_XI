package Chapter06.EX_6_33_PG324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class Craps {
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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int myPoint = 0;

        Status gameStatus;

        int bankBalance = 1000;

        while (bankBalance > 0) {


            System.out.println("Balance is: " + bankBalance);
            System.out.printf("Please make a bet: ");

            int wager = Integer.parseInt(reader.readLine());

            while (wager > bankBalance) {
                System.out.println("Bet too large, make smaller bet - actual balance: " + bankBalance);
                wager = Integer.parseInt(reader.readLine());
            }


            int sumOfDice = rollDice();

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
                    System.out.printf("Point is  %d%n", myPoint);
                    break;
            }
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }

            if (gameStatus == Status.WON) {
                System.out.println("Player won bet");
                bankBalance = bankBalance + wager;
                messages();

            } else {
                System.out.println("Player lost bet");
                messages();
                bankBalance = bankBalance - wager;
                if (bankBalance == 0) {
                    System.out.println("You've lost all the money!");
                }

            }
        }
    }


    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d +%d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void messages() {

        switch (randomNumbers.nextInt(4)) {
            case 0:
                System.out.println("You are going down!");
                break;
            case 1:
                System.out.println("Keep it up!");
                break;
            case 2:
                System.out.println("Make higher bet to big win!");
                break;
            case 3:
                System.out.println("Careful or you will loose all your money");
                break;
        }
    }


}
