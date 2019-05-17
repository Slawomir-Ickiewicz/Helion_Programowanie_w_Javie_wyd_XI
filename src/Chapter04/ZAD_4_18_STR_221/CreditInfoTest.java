package Chapter04.ZAD_4_18_STR_221;


public class CreditInfoTest {
    public static void main(String[] args) {
        CreditInfo noweKonto = new CreditInfo(1234567890, 99, 1500, 400, -1000);

        System.out.println("Actual balance on account "+noweKonto.getAccountNo()+" is:" +noweKonto.getNewBalance());
        if (noweKonto.getNewBalance()<noweKonto.creditLimit){
            System.out.println("Credit limit exceeded!");
        }


    }

}

