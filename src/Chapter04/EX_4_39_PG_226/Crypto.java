package Chapter04.EX_4_39_PG_226;

//read 4 digit number
//replace each digit by add 7 to it and modulo by 10
//replace 1st with 3rd
//replace 2nd with 4th
//print encrytpted number


//make another app for decrypting


import java.util.Scanner;

public class Crypto {



    public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
            System.out.print("Input four non-negative digits: ");
            int input = in.nextInt();
            int n1Before = input / 1000 % 10;
            int n2Before = input / 100 % 10;
            int n3Before = input / 10 % 10;
            int n4Before = input % 10;
            System.out.println("Original numbers are "+n1Before + " " + n2Before + " " + n3Before + " " + n4Before);
            int n1AfSum = (input / 1000 % 10)+7;
            int n2AfSum = (input / 100 % 10)+7;
            int n3AfSum = (input / 10 % 10)+7;
            int n4AfSum= (input % 10)+7;
            System.out.println("After add 7 to all digits "+n1AfSum + " " + n2AfSum + " " + n3AfSum + " " + n4AfSum);
            int n1AfMod = ((input / 1000 % 10)+7)%10;
            int n2AfMod = ((input / 100 % 10)+7)%10;
            int n3AfMod = ((input / 10 % 10)+7)%10;
            int n4AfMod= ((input % 10)+7)%10;
            System.out.println("After mod10 for all digits "+n1AfMod + " " + n2AfMod + " " + n3AfMod + " " + n4AfMod);
            int x = n1AfMod;
            int y = n2AfMod;
            n2AfMod = n4AfMod;
            n4AfMod = y;
            n1AfMod = n3AfMod;
            n3AfMod = x;
            System.out.println("After replace 1st<->3rd and 2nd<->4th "+n1AfMod+ n2AfMod+ n3AfMod+ n4AfMod);
            String userString = "" + n1AfMod+n2AfMod+n3AfMod+n4AfMod;
            System.out.println(userString);
      String x2 = String.format("%04d", Integer.parseInt(userString));
       int x3 = Integer.parseInt(String.valueOf(userString));
        System.out.println(x3);








    }




}
