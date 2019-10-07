package Chapter06.EX_6_34_PG324;

import java.sql.SQLOutput;

public class Numbers {


    public static void main(String[] args) {

        System.out.println("255 decimal numbers converted to binary: ");

        for(int i=1; i<=7; i++){
            System.out.printf("%d\t\t%s\t\t\t%s\t\t%s\n",
                    i, toBinary(i), toOctal(i), toHex(i));

        }

        for(int i=8; i<128; i++){
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\n",
                    i, toBinary(i), toOctal(i), toHex(i));

        }

        for(int i=128; i<=255; i++){
            System.out.printf("%d\t\t%s\t%s\t\t%s\n",
                    i, toBinary(i), toOctal(i), toHex(i));

        }








    }


    public static String toBinary(int decimal) {

        int result;
        int divide = decimal;
        String binary = "";

        while (divide > 0) {
            result = decimal % 2;
            divide = decimal / 2;
            decimal = divide;
            binary = result + "" + binary;
        }

        return binary;
    }

    public static String toOctal(int decimal) {
        String resultOctal = "";
        while (decimal > 0) {

            int remainder = decimal % 8;
            decimal = decimal / 8;
            resultOctal = remainder + resultOctal;
        }
        return resultOctal;
    }


    public static String toHex(int decimal) {

        String resultHex = "";
        String newRemainder = "";


        while (decimal > 0) {

            int remainder = decimal % 16;
            decimal = decimal / 16;
            if (remainder > 9) {
                switch (remainder) {
                    case 10:
                        newRemainder = "A";
                        break;
                    case 11:
                        newRemainder = "B";
                        break;
                    case 12:
                        newRemainder = "C";
                        break;
                    case 13:
                        newRemainder = "D";
                        break;
                    case 14:
                        newRemainder = "E";
                        break;
                    case 15:
                        newRemainder = "F";
                        break;
                }
                resultHex = newRemainder + resultHex;
            } else {
                resultHex = remainder + resultHex;
            }
        }
        return resultHex;
    }
}
