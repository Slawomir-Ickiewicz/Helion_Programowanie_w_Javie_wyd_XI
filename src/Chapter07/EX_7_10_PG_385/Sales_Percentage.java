package Chapter07.EX_7_10_PG_385;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sales_Percentage {


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static double totalSalary (double sale){

        double total = 2000 + sale * 0.09;

        return total;

    }



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int anotherSaler = 1;
        int firstRange = 0;
        int secondRange = 0;
        int thirdRange = 0;
        int fourthRange = 0;
        int fifthRange = 0;
        int sixthRange = 0;
        int seventhRange = 0;
        int eigthRange = 0;
        int ninthRange = 0;
        int tenthRange = 0;
        int eleventhRange = 0;


        while (anotherSaler == 1){

            System.out.println("Please enter total sale for one employee: ");
            double oneSale = Double.parseDouble(reader.readLine());



            if(totalSalary(oneSale)>=2000 && totalSalary(oneSale)<= 2099 ){
                firstRange++;
            }
            else if (totalSalary(oneSale)>=2100 && totalSalary(oneSale)<= 2199 ){
                secondRange++;
            }
            else if (totalSalary(oneSale)>=2200 && totalSalary(oneSale)<= 2299 ){
                thirdRange++;
            }
            else if (totalSalary(oneSale)>=2300 && totalSalary(oneSale)<= 2399 ){
                fourthRange++;
            }
            else if (totalSalary(oneSale)>=2400 && totalSalary(oneSale)<= 2499 ){
                fifthRange++;
            }
            else if (totalSalary(oneSale)>=2500 && totalSalary(oneSale)<= 2599 ){
                sixthRange++;
            }
            else if (totalSalary(oneSale)>=2600 && totalSalary(oneSale)<= 2699 ){
                seventhRange++;
            }
            else if (totalSalary(oneSale)>=2700 && totalSalary(oneSale)<= 2799 ){
                eigthRange++;
            }
            else if (totalSalary(oneSale)>=2800 && totalSalary(oneSale)<= 2899 ){
                ninthRange++;
            }
            else if (totalSalary(oneSale)>=2900 && totalSalary(oneSale)<= 2999 ){
                tenthRange++;
            }
            else if (totalSalary(oneSale)>=3000 ){
                eleventhRange++;
            }



            System.out.println("Enter 1 if you want to enter another saler");
            anotherSaler = Integer.parseInt(reader.readLine());


        }

        int [] salaryTable = new int[11];
        salaryTable[0] =  firstRange;
        salaryTable[1] =  secondRange;
        salaryTable[2] =  thirdRange;
        salaryTable[3] =  fourthRange;
        salaryTable[4] =  fifthRange;
        salaryTable[5] =  sixthRange;
        salaryTable[6] =  seventhRange;
        salaryTable[7] =  eigthRange;
        salaryTable[8] =  ninthRange;
        salaryTable[9] =  tenthRange;
        salaryTable[10] = eleventhRange;

        System.out.printf("%11s\t%22s\n", "Salary Range", "Salesperson Count");


        System.out.println("2000 to 2099:\t\t "+salaryTable[0]);
        System.out.println("2100 to 2199:\t\t "+salaryTable[1]);
        System.out.println("2200 to 2299:\t\t "+salaryTable[2]);
        System.out.println("2300 to 2399:\t\t "+salaryTable[3]);
        System.out.println("2400 to 2499:\t\t "+salaryTable[4]);
        System.out.println("2500 to 2599:\t\t "+salaryTable[5]);
        System.out.println("2600 to 2699:\t\t "+salaryTable[6]);
        System.out.println("2700 to 2799:\t\t "+salaryTable[7]);
        System.out.println("2800 to 2899:\t\t "+salaryTable[8]);
        System.out.println("2900 to 2999:\t\t "+salaryTable[9]);
        System.out.println("from 3000:   \t\t "+salaryTable[10]);






    }
}