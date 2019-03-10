import java.util.Scanner;

public class Zadania_2_15_Arytmetyka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe calkowita do obliczen: ");
        int x  = input.nextInt();

        System.out.println("Podaj druga liczbe calkowita do obliczen: ");
        int y  = input.nextInt();

        int suma = x + y;
        int roznica = x - y;
        int iloczyn = x * y;
        int iloraz = x / y;

        System.out.println("Suma wynosi " +suma);
        System.out.println("Roznica wynosi " +roznica);
        System.out.println("Iloczyn wynosi " +iloczyn);
        System.out.println("Iloraz wynosi " +iloraz);



    }
}
