package Chapter06.EX_6_27_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestCommonDivisor {

    public static void euklides(int a, int b) {

       int x;

        while (b > 0) {
            x = a % b;
            a = b;
            b = x;

        }
        System.out.println(a);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        euklides(a, b);


    }
}
