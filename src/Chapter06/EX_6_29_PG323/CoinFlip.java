package Chapter06.EX_6_29_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class CoinFlip {

    public static void printMenu(){
        System.out.println("1. Flip the coin");
        System.out.println("2. Exit");

    }

    private enum  Coin{
        HEADS,TAILS;

    }
    public static  Coin FlipTheCoin(){
        SecureRandom randomnumbers = new java.security.SecureRandom();
        int randomValue = randomnumbers.nextInt(2);
        Coin pick = null;
        if (randomValue == 1){
              pick = Coin.HEADS;
        }
        else{
             pick = Coin.TAILS;
        }

        return pick;
    }

    public static void main(String[] args) throws IOException {
        printMenu();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        int sumTails = 0;
        int sumHeads = 0;
        int allFlips = 0;


      while (choice == 1){
          System.out.println("Please enter number of of flips: ");
          int enteredFlipNumber = Integer.parseInt((reader.readLine()));


          for (int i = 0; i < enteredFlipNumber; i++) {


              Coin currentflip = FlipTheCoin();
              if (currentflip == Coin.HEADS) {
                  sumHeads++;
                  System.out.println("Heads!");

              } else {
                  sumTails++;
                  System.out.println("Tails!");
              }

              allFlips++;
          }

            choice = Integer.parseInt(reader.readLine());


      }

            System.out.println("All flips: "+allFlips);
            System.out.println( "Tails: "+sumTails);
            System.out.println("Heads:"+sumHeads);


        }
    }

