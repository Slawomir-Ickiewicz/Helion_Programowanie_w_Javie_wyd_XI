package ZAD_3_17_STR_164;

public class HealthProfile {
    private String name;
    private String surname;
    private String sex;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private int weight;

    public HealthProfile() {

    }

    public HealthProfile(String name, String surname, String sex, int dayOfBirth, int monthOfBirth, int yearOfBirth, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;

    }

    //GETTERS


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHeight() {
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


    public String getSex() {

        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
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

    public int getAge() {
        return 2019 - yearOfBirth;
    }

    public int maxHeartRate() {
        return 220 - getAge();
    }


    public double minTargetHeartRate() {
        return 0.5 * maxHeartRate();
    }

    public double maxTargetHeartRate() {
        return 0.85 * maxHeartRate();
    }

    public double bmi() {

        return getWeight()/(Math.pow((getHeight() / 100),2));
    }

    public void showAllPatientData(HealthProfile patient) {
        System.out.println("Name: " + patient.getName());
        System.out.println("Surname: " + patient.getSurname());
        System.out.println("Date of birth: " + patient.getDayOfBirth() + "." + patient.getMonthOfBirth() + "." + patient.getYearOfBirth());
        System.out.println("Sex: " + patient.getSex());
        System.out.println("Weight: " + patient.getWeight() + "kg");
        System.out.println("Height: " + patient.getHeight() + "cm");
        System.out.println("Patient is " + patient.getAge() + " years old");
        System.out.println("");
        System.out.println("Current BMI is: " + patient.bmi());
        System.out.println("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
        System.out.println("");
        System.out.println("Max heartrate: " + patient.maxHeartRate());
        System.out.println("Min target heartrate: " + patient.minTargetHeartRate());
        System.out.println("Max target heartrate: " + patient.maxTargetHeartRate());


    }


}
