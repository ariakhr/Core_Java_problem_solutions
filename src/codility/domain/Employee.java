package codility.domain;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int id;
    private int salary;


    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Jake",112, 30001);
        Employee e2 = new Employee("Matt",115, 20001);
        Employee e3 = new Employee("Joy",116, 90001);
        Employee e4 = new Employee("Gentrie",117, 70001);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        return employees;
    }
}
