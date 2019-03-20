package ZAD_3_17_STR_164;


//tresc zadania " Napisz aplikacje,ktora prosi o informacje,tworzy obiekt klasy HealthProfile i i wysweitla informacje o obiekcie imie i nazwisko,plec,date urodzenia,wzrost i wage.
//Nastepnie przedstawia wyliczony wiek w latach ,indeks BMI,oraz maksymalny
// i docelowy rytm serca.Jako czesc wyniku powinna pojawic sie rowniez tabelka z  mozliwymi zakresami BMI jak w ciwczeniu 2.33


import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[]args){

    HealthProfile profil1 = new HealthProfile("Adam", "Kowalski", "Male", 23, 11, 2000, 176, 88) {


    };

        HealthProfile profil2 = new HealthProfile("sadsa", "sadaa", "Male", 23, 11, 2000, 176, 88) {


        };
        Scanner input  = new Scanner(System.in);


profil1.showAllPatientData(profil1);
profil2.showAllPatientData(profil2);



}

}
