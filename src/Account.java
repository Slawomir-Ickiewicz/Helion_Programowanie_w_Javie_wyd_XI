public class Account {

    private String name; //zmienna instancji(obiektu)
    private double balance; //nalezy pamietac ze kady obiekt klasy Account bedzie przechowywal wlasna kopie tych zmiennych!!!
    //pamietaj ze te zmienne sa prywatne wiec inne klasy tego nie pobiora chyba ze wyolaja metode ktora to zwroci I JEST publicna - w naszym wypadku jest to getbalance albo getname



    public Account(String name, double balance) {
        this.name = name;


        if (balance > 0.0) { //jesli balans jest poprawdny czyli dodatni
            this.balance = balance; //przypisz go do zmiennej instancji
        }
    }
    // metoda deponujaca(dodajaca) kwote(jesli jest dodatnia)
    // do aktualnego salda
    public void deposit (double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
            }

     }

     public void withdraw (double withdrawAmount){
        if (withdrawAmount>balance){
            System.out.println("Wyplata przekraczalaby dostepny stan srodkow");


        }
        else
        {
            balance = balance - withdrawAmount;
        }
     }

    public void setName(String name) { //PARAMETR JEST ZMIENNA LOKALNA czyli moze byc stosowana tylko w tej metodzie!!!
        this.name = name;

        }

    public String getName(){
    return name;
        }

    public double getBalance(){ // ta metoda umozliwia innym klasom ktorych metody wywolyja metody tej klasy pobranie zawartosci smiennje balance
        return balance;
        }
    }


