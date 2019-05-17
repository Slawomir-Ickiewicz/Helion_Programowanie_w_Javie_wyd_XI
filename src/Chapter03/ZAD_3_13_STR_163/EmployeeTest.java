package Chapter03.ZAD_3_13_STR_163;

public class EmployeeTest {

    public static void main(String[] args) {
    Employee employee = new Employee("Adam","Nowak",2000);
    Employee employee2 = new Employee("Anna", "Kowalaska",4000);

    System.out.println("Miesieczna wyplata pracownika " +employee.getName()+" " +employee.getSurname() +" wynosi " +employee.getMonthSalary());
    System.out.println("Miesieczna wyplata pracownika " +employee2.getName()+" " +employee2.getSurname() +" wynosi " +employee2.getMonthSalary());

        System.out.println("Rocznne zarobki " +employee.getName() +" wynosza " +employee.yearSalary());
        System.out.println("Rocznne zarobki " +employee2.getName() +" wynosza " +employee2.yearSalary());

        employee.monthSalary *= 1.1;
        employee2.monthSalary*=1.1;

        System.out.println("Rocznne zarobki po podwyzce " +employee.getName() +" wynosza " +employee.yearSalary());
        System.out.println("Rocznne zarobki po podwyzce " +employee2.getName() +" wynosza " +employee2.yearSalary());




    }
}
