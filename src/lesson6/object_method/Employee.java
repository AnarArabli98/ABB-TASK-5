package lesson6.object_method;

import java.util.Objects;

public class Employee {


    private String surname;
    private String name;
    private double salary;

    public Employee(int salary, String surname, String name) {
        this.salary = salary;
        this.surname = surname;
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee cloneEmployee) {
            Employee anar = (Employee) obj;
            return this.surname.equals(anar.getSurname())
                    && this.name.equals(anar.getName());

        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }


}
