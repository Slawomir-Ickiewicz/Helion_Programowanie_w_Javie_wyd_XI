package Chapter06.EX_6_35_PG_324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class CAI {

    static int  correctResult;

    public static void randomExercise()  {
        SecureRandom randomNum = new SecureRandom();


        int num1 = randomNum.nextInt(9);
        int num2 = randomNum.nextInt(9);

        System.out.println("Enter result of multiply of "+num1 +" and "+num2+": ");
        correctResult  = num1*num2;



    }

    public static void main(String[] args) throws IOException {

        BufferedReader readedResult = new BufferedReader(new InputStreamReader(System.in));

        int studentResult = 0;
        int another = 0;



        while (another != -1){

            randomExercise();



         studentResult = Integer.parseInt(readedResult.readLine());

        while (studentResult != correctResult){
            System.out.println("No. Try again!");
            studentResult = Integer.parseInt(readedResult.readLine());
        }

            System.out.println("Correct! Excellent! Press -1 to exit or any number to continue");
            another = Integer.parseInt(readedResult.readLine());
        }


    }
}
