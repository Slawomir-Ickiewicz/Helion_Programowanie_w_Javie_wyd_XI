package ZAD_3_16_STR_164;

public class HeartRates {
    String name;
    String surname;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;

    public HeartRates(String name,String surname,int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.name = name;
        this.surname = surname;
        this.dayOfBirth  = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;

    }


    //SETTERS


    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    //GETTERS


    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge(){
        return 2019 - yearOfBirth;
    }

    public int maxHeartRate(){
        return 220-getAge();
    }

    public double minTargetHeartRate(){
        return 0.5*maxHeartRate();
    }

    public double maxTargetHeartRate(){
        return 0.85*maxHeartRate();
    }

    public void showTarget(){
        System.out.println("Target heart rate is between" +minTargetHeartRate() +" and " +maxTargetHeartRate());
    }
}
