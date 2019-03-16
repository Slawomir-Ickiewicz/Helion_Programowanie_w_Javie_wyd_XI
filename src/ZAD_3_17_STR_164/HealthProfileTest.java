package ZAD_3_17_STR_164;


//tresc zadania " Napisz aplikacje,ktora prosi o informacje,tworzy obiekt klasy HealthProfile i i wysweitla informacje o obiekcieimie i nazwisko,plec,date urodzenia,wzrost i wage.
//Nastepnie przedstawia wyliczony wiek w latach ,indeks BMI,oraz maksymalny
// i docelowy rytm serca.Jako czesc wyniku powinna pojawic sie rowniez tabelka z  mozliwymi zakresami BMI jak w ciwczeniu 2.33


public class HealthProfileTest {
    public static void main(String[]args){

    HealthProfile profil1 = new HealthProfile("Adam", "Kowalski", true, 23, 11, 2000, 176, 88) {


    };

        System.out.println(profil1.bmi());
}

}
