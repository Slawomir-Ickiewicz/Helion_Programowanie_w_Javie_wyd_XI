package ZAD_3_12_STR_163;//ZADANIE 3.12 STR.164

public class Invoice {

    private String nrProduktu;
    private String opis;
    private int liczbaZakSztuk;
    private double cenaSztuki;

    public Invoice(String nrProduktu, String opis,int liczbaZakSztuk, double cenaSztuki) {

        setNrProduktu(nrProduktu);
        setOpis(opis);
        setLiczbaZakSztuk(liczbaZakSztuk);
        setCenaSztuki(cenaSztuki);

    }


    //SETTERS

    public void setNrProduktu(String nrProduktu){
        this.nrProduktu = nrProduktu;

    }

    public void setOpis(String opis) {

        this.opis = opis;
    }

    public void setLiczbaZakSztuk(int liczbaZakSztuk){

        this.liczbaZakSztuk = (liczbaZakSztuk<0) ? 0:liczbaZakSztuk;
    }

    public void setCenaSztuki(double cenaSztuki){

       this.cenaSztuki = (cenaSztuki<0) ? 0 : cenaSztuki; //czyli taki if cenaSztuki<0 this.cenaSztuki = 0 else thiscenaSztuki = cenasztuki

    }

//GETTERS
    
    double kwota;

    public String getNrProduktu(){
        return nrProduktu;
    }

    public int getLiczbaZakSztuk() {

        return liczbaZakSztuk;
    }

    public String getOpis(){

        return opis;
    }

    public double getCenaSztuki(){

        return cenaSztuki;
    }




    public double getInvoiceAmount () {

        kwota = liczbaZakSztuk*cenaSztuki;
       return kwota;
   }



}
