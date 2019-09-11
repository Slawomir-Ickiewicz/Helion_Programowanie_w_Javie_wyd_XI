package Chapter06.EX_6_22_PG322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConversion {


    public static double celsius(double fahrenheit) {
        double celsius1 = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius1;
    }

    public static double fahrenheit (double celsius){
        double fahrenheit1 = 9.0/5.0* celsius+32;
        return fahrenheit1;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter temperature in Celsius");
        double celsius = Double.parseDouble(reader.readLine());
        fahrenheit(celsius);
        System.out.println(celsius+ " Celsius it is "+fahrenheit(celsius)+" Fahrenheit");
        System.out.println("Please enter temperature in Fahrenheits");
        double fahrenheit = Double.parseDouble(reader.readLine());
        System.out.println(fahrenheit+ " Fahrenheit it is "+celsius(fahrenheit)+" Celsius");

    }
}
