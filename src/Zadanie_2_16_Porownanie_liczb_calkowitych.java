import java.util.Scanner;

public class Zadanie_2_16_Porownanie_liczb_calkowitych {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe calkowita do obliczen: ");
        int x = input.nextInt();

        System.out.println ("Podaj druga liczbe calkowita do obliczen: ");
        int y = input.nextInt();

        if (x > y) {
            System.out.println(+x +" jest wieksze od " +y);
            }
        if (y > x){
            System.out.println(+y + " jest wieksze od " + x);

        }
        if (x == y)
        {
            System.out.println(+x +" i "+y +" sa rowne");
        }

    }
}
