package Chapter03.ZAD_3_14_STR_163;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }


    //SETTERS METHODS

    public void setDay (int day){
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;

    }

    //GETTERS METHODS
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate(){
        System.out.println(getDay()+"-"+getMonth()+"-"+getYear());
    }
}



