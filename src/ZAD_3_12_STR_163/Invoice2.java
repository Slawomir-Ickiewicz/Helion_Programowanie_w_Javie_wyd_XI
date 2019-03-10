package ZAD_3_12_STR_163;

import java.util.Scanner;

public class Invoice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("podaj dane faktury");

        Invoice faktureczka  = new Invoice("asd","sad",10,-2);

        System.out.println(faktureczka.getNrProduktu());
        System.out.println(faktureczka.getOpis());
        System.out.println(faktureczka.getLiczbaZakSztuk());
        System.out.println(faktureczka.getCenaSztuki());


        System.out.println(faktureczka.getInvoiceAmount());

    //    printujFakture(faktureczka.getOpis(),faktureczka.getNrProduktu());



    }

   // private static void printujFakture(String opis,String nrProduktu){
   //     System.out.println(opis);
   //     System.out.println(nrProduktu);

  //  }



}
