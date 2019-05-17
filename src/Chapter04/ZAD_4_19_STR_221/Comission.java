

package Chapter04.ZAD_4_19_STR_221;

import java.util.Scanner;

public class Comission {
    double sumOfProducts;


    public double totalEarn(double products){
        return 2000+ 0.09*products;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stoper =0;
        double totalToPay = 0;

        while(stoper!=-1){

            System.out.println("Podaj nr produktu ,jesli chcesz zakonczyc wpisz -1");

            int nrProduktu = input.nextInt();
            {
                if (nrProduktu == 1){

                    System.out.println("ile produktu nr 1?");
                    int ilosc = input.nextInt();
                    totalToPay = totalToPay + 239.99*ilosc;

                }
                if (nrProduktu == 2){
                    System.out.println("ile produktu nr 2?");
                    int ilosc = input.nextInt();
                    totalToPay = totalToPay + 1129.75*ilosc;

                }
                if (nrProduktu == 3){
                    System.out.println("ile produktu nr 3?");
                    int ilosc = input.nextInt();
                     totalToPay = totalToPay + 99.95*ilosc;

                }
                if (nrProduktu == 4){
                    System.out.println("ile produktu nr 4?");
                    int ilosc = input.nextInt();
                     totalToPay = totalToPay + 850.89*ilosc;

                }
                if (nrProduktu == -1){
                    stoper = -1;
                }


            }

        }
        System.out.println("Sum of spended money: "+totalToPay);

        Comission suma = new Comission();
        System.out.println("Sum of earned money by seller: "+suma.totalEarn(totalToPay));


    }


}
