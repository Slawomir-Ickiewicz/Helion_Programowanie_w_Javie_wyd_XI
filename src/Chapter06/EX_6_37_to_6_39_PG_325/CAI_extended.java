package Chapter06.EX_6_37_to_6_39_PG_325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class CAI_extended {
    static SecureRandom randomNum = new SecureRandom();

    static int correctResult;

    public static void randomExercise(int exerciseType, int diffLvl) {

        if (exerciseType == 1 && diffLvl == 1) {

            int num1 = randomNum.nextInt(9);
            int num2 = randomNum.nextInt(9);

            System.out.println("Enter result of addition of " + num1 + " and " + num2 + ": ");
            correctResult = num1 + num2;

        } else if (exerciseType == 1 && diffLvl == 2) {
            int num1 = randomNum.nextInt(99);
            int num2 = randomNum.nextInt(99);

            System.out.println("Enter result of addition of " + num1 + " and " + num2 + ": ");
            correctResult = num1 + num2;

        } else if (exerciseType == 2 && diffLvl == 1) {

            int num1 = randomNum.nextInt(9);
            int num2 = randomNum.nextInt(9);

            System.out.println("Enter result of substraction of " + num1 + " and " + num2 + ": ");
            correctResult = num1 - num2;

        } else if (exerciseType == 2 && diffLvl == 2) {
            int num1 = randomNum.nextInt(99);
            int num2 = randomNum.nextInt(99);

            System.out.println("Enter result of substraction of " + num1 + " and " + num2 + ": ");
            correctResult = num1 - num2;
        } else if (exerciseType == 3 && diffLvl == 1) {

            int num1 = randomNum.nextInt(9);
            int num2 = randomNum.nextInt(9);

            System.out.println("Enter result of multiply of " + num1 + " and " + num2 + ": ");
            correctResult = num1 * num2;

        } else if (exerciseType == 3 && diffLvl == 2) {
            int num1 = randomNum.nextInt(99);
            int num2 = randomNum.nextInt(99);

            System.out.println("Enter result of multiply of " + num1 + " and " + num2 + ": ");
            correctResult = num1 * num2;
        } else if (exerciseType == 4 && diffLvl == 1) {

            int num1 = randomNum.nextInt(9);
            int num2 = randomNum.nextInt(9);

            System.out.println("Enter result of division of " + num1 + " and " + num2 + ": ");
            correctResult = num1 / num2;

        } else if (exerciseType == 4 && diffLvl == 2) {
            int num1 = randomNum.nextInt(99);
            int num2 = randomNum.nextInt(99);

            System.out.println("Enter result of division of " + num1 + " and " + num2 + ": ");
            correctResult = num1 / num2;

        }


    }

    public static void randomGood() {

        int randGood = randomNum.nextInt(4);
        switch (randGood) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Awesome!");
                break;
            case 3:
                System.out.println("Good job!");
                break;
            case 4:
                System.out.println("Brilliant!");
                break;
                default:
                    System.out.println("Noise job!");
        }

    }

    public static void randomBad() {

        int randGood = randomNum.nextInt(4);
        switch (randGood) {
            case 1:
                System.out.println("Not good. Try again");
                break;
            case 2:
                System.out.println("Nope!");
                break;
            case 3:
                System.out.println("Wrong answer.Focus!");
                break;
            case 4:
                System.out.println("Incorrect! Sorry!");
                break;
            default:
                System.out.println("Forked up job!");
        }

    }

    public static void main(String[] args) throws IOException {


        BufferedReader readedResult = new BufferedReader(new InputStreamReader(System.in));

        int anotherPlayer = 0;

        while (anotherPlayer == 0) {
            System.out.println("NOW PLAYER'S ROUND - You have 10 exercises to do.");
            System.out.println();
            System.out.println("Please select problem category:");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");

            int catSelect = Integer.parseInt(readedResult.readLine());

            System.out.println("Please enter difficulty level:");
            System.out.println("1. One digit numbers");
            System.out.println("2. Two digit numbers");
            int diffLvl = Integer.parseInt(readedResult.readLine());

            System.out.println();

            int goodAnswers = 0;

            for (int i = 0; i < 10; i++) {
                randomExercise(catSelect,diffLvl);
                int studentResult = Integer.parseInt(readedResult.readLine());


                if (studentResult == correctResult) {
                    randomGood();
                    goodAnswers++;

                    System.out.println();

                } else randomBad();
                System.out.println();

            }

            if (goodAnswers < 7.5) {
                System.out.println("You should ask teacher for help");
                System.out.println();
            } else if (goodAnswers > 7.5) {
                System.out.println("Congratulations  - you can move to next level!");
                System.out.println();
            }

        }

    }
}

