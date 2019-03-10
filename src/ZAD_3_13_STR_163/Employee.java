package ZAD_3_13_STR_163;

public class Employee {
    String name;
    String surname;
    double monthSalary;


public Employee(String name,String surname,double monthSalary){
    this.name = name;
    this.surname = surname;
    this.monthSalary = monthSalary;

}
    //SETTERS
public void setName(String name){
    this.name = name;
}

public void setSurname(String surname){
    this.surname = surname;

}

public void setMonthSalary (double monthSalary) {
    if (monthSalary > 0) {
        this.monthSalary = monthSalary;
    }
}

    //GETTERS
    public String getName(){
    return name;
}
    public String getSurname(){
    return surname;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public double yearSalary(){
    return 12*monthSalary;
    }
}
