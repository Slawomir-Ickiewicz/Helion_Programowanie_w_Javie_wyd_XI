package Chapter06.EX_6_24_PG322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumbers {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please one number to check is it is perfect: ");
        int number = Integer.parseInt(reader.readLine());
        int sum = 0;

        for(int i =number-1;i>0;i--){
            if (number%i==0){
                int divisor = i;
                 sum = sum + divisor;
            }
        }
        if(sum==number){
            System.out.println("This number is perfect");
        }
        else {
            System.out.println("This number is not perfect");
        }


    }



}
