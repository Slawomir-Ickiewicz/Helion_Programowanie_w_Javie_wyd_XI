package ZAD_3_17_STR_164;

public class HealthProfile {
   private String name;
    private String surname;
    private boolean sex;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int height;
    private int weight;

    public HealthProfile(String name,String surname,boolean sex,int dayOfBirth,int monthOfBirth,int yearOfBirth,int height,int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;

    }

    //GETTERS


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }


    public boolean isMale() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public double bmi(){

        return (getWeight()/(Math.pow((getHeight()/100),2)));

    }


}
