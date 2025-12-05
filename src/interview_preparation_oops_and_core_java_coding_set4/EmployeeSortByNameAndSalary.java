package interview_preparation_oops_and_core_java_coding_set4;

import java.util.*;

public class EmployeeSortByNameAndSalary

{


    static void main() {
        Employee emp1=new Employee("Gautam",10000);
        Employee emp2=new Employee("Gaurav",50000);
        Employee emp3=new Employee("Kamiya",30000);
        Employee emp4=new Employee("Geeta",15000);
        Employee emp5=new Employee("Kailash",20000);
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("Employee list without sorting");
        for(Employee emp:employeeList)
        {
            System.out.println("Employee Name is: "+emp.getName() + " and salary is: "+emp.getSalary());
        }
        System.out.println("Employee list sorted by name");
        employeeList.sort(Comparator.comparing(Employee::getName));
        for(Employee emp:employeeList)
        {
            System.out.println("Employee Name is: "+emp.getName() + " and salary is: "+emp.getSalary());
        }
        System.out.println("Employee list sorted by salary");
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        for(Employee emp:employeeList)
        {
            System.out.println("Employee Name is: "+emp.getName() + " and salary is: "+emp.getSalary());
        }

    }

}


class Employee
{

    String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}