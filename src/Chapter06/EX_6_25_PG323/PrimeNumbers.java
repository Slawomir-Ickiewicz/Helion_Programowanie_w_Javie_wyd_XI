package Chapter06.EX_6_25_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please one number to check is it is prime: ");
        int number = Integer.parseInt(reader.readLine());
        int sum = 0;

        for(int i =number;i>0;i--){
            if (number%i==0){

                sum = sum + 1;
            }
        }
        if(sum!=2){
            System.out.println("This number is not prime");
        }
        else {
            System.out.println("This number is prime");
        }


    }

}
