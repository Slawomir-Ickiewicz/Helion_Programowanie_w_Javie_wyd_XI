package Chapter07.EX_7_17_PG_386;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

//use table to print the count of sum of rolling two dices (counted for  36 000 000 rolls).

public class SumOfDices {



    public static void main(String[] args) {

        //uzyj tablicy jednowymiarowej do zliczenia wystapien kazdej sumy.wyswietl wyniki w postaci tabelarycznej


        Random random = new Random();
        int [] table = new int[11];

        for (long i = 0; i < 36000000; i++) {
            int diceRoll = random.nextInt(6)+1;
            int diceRoll2 = random.nextInt(6)+1;
            int sum = diceRoll+diceRoll2;
          //  System.out.println(sum);

            if (sum ==2){

                table[0] = table[0]+1;
            }
            else  if (sum ==3){

                table[1] = table[1]+1;
            }
            else  if (sum ==4){

                table[2] = table[2]+1;
            }
            else  if (sum ==5){

                table[3] = table[3]+1;
            }
            else  if (sum ==6){

                table[4] = table[4]+1;
            }
            else  if (sum ==7){

                table[5] = table[5]+1;
            }
            else  if (sum ==8){

                table[6] = table[6]+1;
            }
            else  if (sum ==9){

                table[7] = table[7]+1;
            }
            else  if (sum ==10){

                table[8] = table[8]+1;
            }
            else  if (sum ==11){

                table[9] = table[9]+1;
            }
            else  if (sum ==12){

                table[10] = table[10]+1;
            }

        }
        System.out.printf("%s%8s%n", "Sum " , " How many times");

        for (int i = 0; i <table.length ; i++) {
            System.out.printf("%3d%9d%n",i+2,table[i]);

        }


    }
}
