package SalaryCalculation;

public class Runner {

    public static void main(String[] args) {

        Employee employee = new Employee("Drake",20000,41,2020);
        System.out.println("Name: " + employee.name);
        System.out.println("Maas: " + employee.salary);
        System.out.println("Odenecek Vergi: " + employee.tax() + "₺");
        System.out.println("Odenecek Bonus: " + employee.bonus() + "₺");
        System.out.println("Maaş Artışı: " + employee.raiseSalary() + "₺");

        System.out.println("Toplam Odenecek Ucret: " + ((employee.salary) + (employee.raiseSalary())));
        System.out.println(employee.toString());

        Employee e1=new Employee("Murat",30000,45,2016);
        System.out.println("e1.toString() = " + e1.toString());
        System.out.println("Bonus= " + e1.bonus());
        System.out.println("e1.raiseSalary() = " + e1.raiseSalary());
        System.out.println("e1.tax() = " + e1.tax());
    }
}
