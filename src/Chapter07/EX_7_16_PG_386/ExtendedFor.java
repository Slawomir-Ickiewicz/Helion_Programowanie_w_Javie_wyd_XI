package Chapter07.EX_7_16_PG_386;

//Napisz aplikację która używa rozszerzonej pętli for do obliczeia sumy wartosci typu double przekazanych w argumentach wiersza polecen.
// Hint: Użyj statycznej metody parseDouble klasy Double do konwersji teksu na wartosc double.

public class ExtendedFor {

    public static void main(String[] args) {

        double sum = 0;

        for (String liczba : args
        ) {

            double argValue = Double.parseDouble(liczba);

            sum = argValue + sum;
        }

        System.out.println(sum);
    }

}
