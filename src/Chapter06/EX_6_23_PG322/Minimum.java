package Chapter06.EX_6_23_PG322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum

{

    public static double minimum3(double a,double b,double c){
        return Math.min(Math.min(a,b),c);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please three numbers to calculate minimum: ");
        double first = Double.parseDouble(reader.readLine());
        double second = Double.parseDouble(reader.readLine());
        double third = Double.parseDouble(reader.readLine());

        System.out.println("Minimum is: "+minimum3(first,second,third));

    }
}
