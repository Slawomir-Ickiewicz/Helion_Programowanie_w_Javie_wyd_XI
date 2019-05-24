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


        System.out.print("Input four non-negative digits fo encryption: ");
        int input = in.nextInt();
        int n1Before = input / 1000 % 10;
        int n2Before = input / 100 % 10;
        int n3Before = input / 10 % 10;
        int n4Before = input % 10;
        System.out.println("Original numbers are " + n1Before + " " + n2Before + " " + n3Before + " " + n4Before);
        int n1AfSum = (input / 1000 % 10) + 7;
        int n2AfSum = (input / 100 % 10) + 7;
        int n3AfSum = (input / 10 % 10) + 7;
        int n4AfSum = (input % 10) + 7;
        System.out.println("After add 7 to all digits " + n1AfSum + " " + n2AfSum + " " + n3AfSum + " " + n4AfSum);
        int n1AfMod = ((input / 1000 % 10) + 7) % 10;
        int n2AfMod = ((input / 100 % 10) + 7) % 10;
        int n3AfMod = ((input / 10 % 10) + 7) % 10;
        int n4AfMod = ((input % 10) + 7) % 10;
        System.out.println("After mod10 for all digits " + n1AfMod + " " + n2AfMod + " " + n3AfMod + " " + n4AfMod);
        int x = n1AfMod;
        int y = n2AfMod;
        n2AfMod = n4AfMod;
        n4AfMod = y;
        n1AfMod = n3AfMod;
        n3AfMod = x;
        System.out.println("After replace 1st<->3rd and 2nd<->4th " + n1AfMod + n2AfMod + n3AfMod + n4AfMod);
        System.out.println();

        System.out.print("Input four non-negative digits for decryption: ");
        int inputDec = in.nextInt();
        int n1BeforeDec = inputDec / 1000 % 10;
        int n2BeforeDec = inputDec / 100 % 10;
        int n3BeforeDec = inputDec / 10 % 10;
        int n4BeforeDec = inputDec % 10;
        System.out.println("Original numbers for decryption are " + n1BeforeDec + " " + n2BeforeDec + " " + n3BeforeDec + " " + n4BeforeDec);

        int a = n1BeforeDec;
        n1BeforeDec = n3BeforeDec;
        n3BeforeDec = a;

        int b = n2BeforeDec;
        n2BeforeDec = n4BeforeDec;
        n4BeforeDec = b;
        System.out.println("Nums for decryption after replace 1st<->3rd and 2nd<->4th " + n1BeforeDec + n2BeforeDec + n3BeforeDec + n4BeforeDec);

        n1BeforeDec = decrypt(n1BeforeDec);
        n2BeforeDec = decrypt(n2BeforeDec);
        n3BeforeDec = decrypt(n3BeforeDec);
        n4BeforeDec = decrypt(n4BeforeDec);
        System.out.println("Number after decryption are " + n1BeforeDec + " " + n2BeforeDec + " " + n3BeforeDec + " " + n4BeforeDec);

    }

    private static int decrypt(int number) {

        if (number >= 7) {
            number -= 7;
        } else {
            number += 3;
        }
        return number;
    }

}
