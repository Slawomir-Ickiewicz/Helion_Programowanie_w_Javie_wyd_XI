package ZAD_3_17_STR_164;


//tresc zadania " Napisz aplikacje,ktora prosi o informacje,tworzy obiekt klasy HealthProfile i i wysweitla informacje o obiekcie imie i nazwisko,plec,date urodzenia,wzrost i wage.
//Nastepnie przedstawia wyliczony wiek w latach ,indeks BMI,oraz maksymalny
// i docelowy rytm serca.Jako czesc wyniku powinna pojawic sie rowniez tabelka z  mozliwymi zakresami BMI jak w ciwczeniu 2.33


import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {

        HealthProfile patient1 = new HealthProfile();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie pacjenta: ");
        String name = input.next();
        patient1.setName(name);
        System.out.println("Podaj nazwisko pacjenta: ");
        String surname = input.next();
        patient1.setSurname(surname);
        System.out.println("Podaj dzien urodzenia: ");
        int day = input.nextInt();
        patient1.setDayOfBirth(day);
        System.out.println("Podaj miesiac urodzenia: ");
        int month = input.nextInt();
        patient1.setMonthOfBirth(month);
        System.out.println("Podaj rok urodzenia: ");
        int year = input.nextInt();
        patient1.setYearOfBirth(year);
        System.out.println("Podaj wage pacjenta w kilogramach: ");
        int weight = input.nextInt();
        patient1.setWeight(weight);
        System.out.println("Podaj wzrost pacjenta w centymetrach: ");
        int height = input.nextInt();
        patient1.setHeight(height);
        System.out.println("Podaj plec pacjenta: ");
        String sex = input.next();
        patient1.setSex(sex);

        patient1.showAllPatientData(patient1);


    }

}
