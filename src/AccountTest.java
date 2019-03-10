
import java.util.Scanner;


public class AccountTest {

    public static void main(String[] args) {

        //Account myAccount  = new Account();
        Account account1 = new Account("Anna Nowak", 50.00); //musi byc konstruktor w klasie Account zeby to zadzialalo
        Account account2 = new Account("Jan Kowalski", -7.53);


        System.out.printf("%s - stankonta: %.2f zł%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s - stankonta: %.2f zł%n%n",
                account2.getName(), account2.getBalance());

        //  metoda zastapujaca wyswietlanie stanu konta jak powyzej zeby mniej zajmowalo !
        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz kwote do wplacenia na konto account1: ");

        double depositAmount = input.nextDouble();

        System.out.printf("%nDodawanie wartosci %.2f do konta account1%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s - stankonta: %.2f zł%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s - stankonta: %.2f zł%n%n",
                account2.getName(), account2.getBalance());

        // View
        displayAccount(account1);
        displayAccount(account2);

        System.out.println("Wpisz kwote do wplacenia na konto account2: ");

        depositAmount = input.nextDouble();

        System.out.printf("%nDodawanie wartosci %.2f do konta account2%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s - stankonta: %.2f zł%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s - stankonta: %.2f zł%n%n",
                account2.getName(), account2.getBalance());


        System.out.println("Podaj kwote jaka chcesz wyplacic z konta account1: ");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);
        System.out.printf("%s - stankonta: %.2f zł%n",
                account1.getName(), account1.getBalance());

        //myAccount.setName(theName); // ustawiamy w zmiennej name dzieki metodzie
        System.out.println();

        //System.out.println("imie i nazwisko w obiekcie myAccount " +myAccount.getName());

    }


        public static void displayAccount (Account aca){  //deklaracja zmiennej referencyjnej jako parametru
        //ta metoda jest static bo gdy metoda main (ktora jest statyczna) musi wywolac inna metode tej samej klasy bez tworzenia obiektu tej klasy, metoda ta rowniez musi byc statyczna
            System.out.printf("%s balance: $%.2f%n",
                    aca.getName(), aca.getBalance());


        }
    }