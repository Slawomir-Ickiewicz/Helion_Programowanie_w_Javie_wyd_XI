package Chapter06.EX_6_21_PG322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeparateDigits {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int a) {

        if (a <= 0 || a >= 100000) {
            System.out.println("Number is out of range");
        }
        else if (a<10){
            System.out.println(a);
        }

        else if (a >= 10 && a < 100) {
            int second = modulo(a, 10);
            int first = quotient(a, 10);
            System.out.println(first + "  " + second);
        } else if (a >= 100 && a < 1000) {
            int first = quotient(a, 100);
            int second = quotient(modulo(a, 100), 10);
            int third = modulo(modulo(a, 100), 10);

            System.out.println(first + "  " + second + "  " + third);

        } else if (a >= 1000 && a < 10000) {
            int first = quotient(a, 1000);
            int second = quotient(modulo(a, 1000), 100);
            int third = quotient(modulo(a, 100), 10);
            int fourth = modulo(a, 10);

            System.out.println(first + "  " + second + "  " + third + "  " + fourth);

        } else if (a >= 10000 && a < 100000) {
            int first = quotient(a, 10000);
            int second = quotient(modulo(a, 10000), 1000);
            int third = quotient(modulo(a, 1000), 100);
            int fourth = quotient(modulo(a, 100), 10);
            int fifth = modulo(a, 10);

            System.out.println(first + "  " + second + "  " + third + "  " + fourth + "  " + fifth);

        }


        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number in range 1-100000: ");

        int a = Integer.parseInt(reader.readLine());

        displayDigits(a);
    }
}
