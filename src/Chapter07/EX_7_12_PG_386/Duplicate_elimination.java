package Chapter07.EX_7_12_PG_386;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Duplicate_elimination {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] tab = {0,0,0,0,0};
        int sugNum;
        int unique = 0;

        while (unique !=5){ //while for a whole application that is ruuning until it have 5 unique numbers

            int dupl = 0; // that variable is needed because we cannot check our number with each one in table and takeanother from userin the same time


            System.out.println("Enter unique number");
            sugNum = Integer.parseInt(reader.readLine());

            while (sugNum<10 || sugNum>100){

                System.out.println("Please enter number from range 10 to 100");
                sugNum = Integer.parseInt(reader.readLine());

            }


            for (int i = 0; i <tab.length ; i++){ //compare user entered number with each one in table


                if(sugNum == tab[i]){

                    System.out.println("Number is same like one of the others");
                    dupl = 1;
                    // - if any of those numbers are same like users one we set dupl to 1 because we want to get number again from user

                }

            }

            if (dupl != 1){
                tab[unique] = sugNum;
                unique++;
                //if no duplication found dupl variable is still set to 0 so we can add this numbe to table from start so why unique is set at beginning to 0
                //we increment unique for two reasons : one - because we have 1 unique and to end program at 5 unique numbers, second because unique number is also index in table
            }

            for (int j = 0; j <tab.length ; j++) {
                System.out.println(tab[j]);

            }

        }





}

}
