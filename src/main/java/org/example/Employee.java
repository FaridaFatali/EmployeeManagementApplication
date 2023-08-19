package org.example;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String designation;
    private String department;
    private double salary;

    public Employee(int id, String name, String surname, int age, String designation, String department, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id - " + id + " | name - " + name + " | surname - " + surname + " | age - " + age +
                " | designation - " + designation + " | department - " + department + " | salary - " + salary;
    }
}
