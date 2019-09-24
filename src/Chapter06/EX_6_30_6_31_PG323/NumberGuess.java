package Chapter06.EX_6_30_6_31_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class NumberGuess {

    public static void main(String[] args) throws IOException {

        SecureRandom randomNumber = new java.security.SecureRandom();
        int randomValue = randomNumber.nextInt(1000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int playAgain = 1;
        int guesses = 1;

        while(playAgain == 1){


        System.out.println("Guess number from 1 to 1000: ");
        int number = Integer.parseInt(reader.readLine());



        while (number != randomValue) {
            if (number < randomValue) {
                System.out.println("Too low. Try again");
                number = Integer.parseInt(reader.readLine());
                guesses++;
            } else {
                System.out.println("Too high. Try again");
                number = Integer.parseInt(reader.readLine());
                guesses++;
            }

        }

            if(guesses < 10){
                System.out.println("You knew secret number or you were lucky!");

            }
            else if(guesses == 10){
                System.out.println("Oh now you know the secret!");

            }
            else {
                System.out.println("Very poor..");
            }

            System.out.println("Do you wanna play again? Enter 1 for yes or 0 for no");
            int answer = Integer.parseInt(reader.readLine());
            playAgain = answer;
             randomValue = randomNumber.nextInt(1000);
             guesses =1;


        }
    }


}
