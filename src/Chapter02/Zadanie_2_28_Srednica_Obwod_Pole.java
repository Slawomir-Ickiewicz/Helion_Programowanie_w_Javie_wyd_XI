package Chapter02;

import java.util.Scanner;

public class Zadanie_2_28_Srednica_Obwod_Pole {
    public static void main(String[] args) {

        System.out.println("Podaj promien");
        Scanner input  = new Scanner(System.in);
        double promien  = input.nextInt();
        System.out.printf("%s%f%n%s%f%n%s%f"," Srednica wynosi ", 2*promien , " Obwod wynosi ", 2*Math.PI*promien, " Pole wynosi ", Math.PI*(Math.pow(promien,2)));
    }
}
