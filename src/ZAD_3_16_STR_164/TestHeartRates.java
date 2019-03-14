package ZAD_3_16_STR_164;

public class TestHeartRates {

    public static void main(String[] args) {

        HeartRates person1 = new HeartRates("Rysio","Kowalski",15,05,1967);
        System.out.println(person1.getName());
        System.out.println(person1.getSurname());
        System.out.println(person1.getDayOfBirth());
        System.out.println(person1.getMonthOfBirth());
        System.out.println(person1.getYearOfBirth());
        System.out.println(person1.getAge());
        System.out.println(person1.maxHeartRate());
        System.out.println(person1.minTargetHeartRate());
        System.out.println(person1.maxTargetHeartRate());


    }
}
