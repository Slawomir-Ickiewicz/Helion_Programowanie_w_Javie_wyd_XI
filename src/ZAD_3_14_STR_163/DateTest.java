package ZAD_3_14_STR_163;

public class DateTest {
    public static void main(String[] args) {


        Date dataTestowa = new Date(13,12,2005);

        dataTestowa.displayDate();

        dataTestowa.setDay(5);
        dataTestowa.setMonth(3);
        dataTestowa.setYear(2019);

        dataTestowa.displayDate();


    }

}
