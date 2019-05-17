package Chapter04.ZAD_4_18_STR_221;

public class CreditInfo {
    public int getAccountNo() {
        return accountNo;
    }

    public int getBeginBalance() {
        return beginBalance;
    }

    public int getShoppingsMonthly() {
        return shoppingsMonthly;
    }

    public int getDepoMonthly() {
        return depoMonthly;
    }

    public int getCreditLimit() {
        return creditLimit;
    }


    int accountNo;
    int beginBalance;
    int shoppingsMonthly;
    int depoMonthly;
    int creditLimit;

    public CreditInfo(int accountNo,int beginBalance,int shoppingsMonthly,int depoMonthly,int creditLimit){
        this.accountNo = accountNo;
        this.beginBalance = beginBalance;
        this.shoppingsMonthly = shoppingsMonthly;
        this.depoMonthly = depoMonthly;
        this.creditLimit = creditLimit;
    }


    public int getNewBalance(){
        return beginBalance-shoppingsMonthly+depoMonthly
                ;
    }

}
