package Chapter06.EX_6_35_6_36_PG_324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class CAI {
    static SecureRandom randomNum = new SecureRandom();

    static int  correctResult;

    public static void randomExercise()  {



        int num1 = randomNum.nextInt(9);
        int num2 = randomNum.nextInt(9);

        System.out.println("Enter result of multiply of "+num1 +" and "+num2+": ");
        correctResult  = num1*num2;



    }

    public static void randomGood(){

        int randGood = randomNum.nextInt(4);
        switch(randGood){
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
        }


    }

    public static void randomBad(){

        int randGood = randomNum.nextInt(4);
        switch(randGood){
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
        }


    }

    public static void main(String[] args) throws IOException {



        BufferedReader readedResult = new BufferedReader(new InputStreamReader(System.in));

        int studentResult = 0;
        int another = 0;



        while (another != -1){

            randomExercise();



         studentResult = Integer.parseInt(readedResult.readLine());

        while (studentResult != correctResult){
            randomBad();
            studentResult = Integer.parseInt(readedResult.readLine());
        }
            randomGood();
            System.out.println("Press -1 to exit or any number to continue");
            another = Integer.parseInt(readedResult.readLine());
        }


    }
}
