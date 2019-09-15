package Chapter06.EX_6_28_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentAverage {


    public static void qualityPoints(double points) {

        if (points >= 90 && points <= 100) {
            System.out.println("4");
        } else if (points >= 80 && points <= 89) {
            System.out.println("3");
        }
        else if (points >= 70 && points <= 79) {
            System.out.println("2");
        }
        else if (points >= 60 && points <= 69) {
            System.out.println("1");
        }
        else if (points <60) {
            System.out.println("0");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());

        qualityPoints(a);


    }
}
