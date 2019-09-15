package Chapter06.EX_6_26_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchNumber {


    public static void switchNum(int a){

        int fourth  = a/1000;
        int third = (a%1000)/100;
        int second = (a%100)/10;
        int first = a%10;

        System.out.print(""+first+second+third+fourth);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        switchNum(number);

    }
}
