package org.example;

import java.util.*;

public class EmployeeService {
    HashSet<Employee> employeeHashSet = new HashSet<>();

    Employee employee1 = new Employee(101, "Jon", "Joseph", 24, "Developer", "IT", 25000);
    Employee employee2 = new Employee(102, "Jennifer", "Williams", 26, "Tester", "CO", 57000);
    Employee employee3 = new Employee(103, "Bob", "Miller", 20, "DevOps Eng", "Admin", 5000);
    Employee employee4 = new Employee(104, "Angelina", "Martinez", 27, "System Eng", "CO", 70000);

    Scanner scanner = new Scanner(System.in);

    boolean found = false;
    int id;
    String name;
    String surname;
    int age;
    String department;
    String designation;
    double salary;

    public EmployeeService() {
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
    }

    public void viewAllEmployees() {
        System.out.println("EMPLOYEE INFO:");
        for (Employee employee : employeeHashSet) {
            System.out.println(employee);
        }
    }

    public void viewEmployee() {
        System.out.print("Enter id: ");
        id = scanner.nextInt();

        for (Employee employee : employeeHashSet) {
            if (employee.getId() == id) {
                System.out.println("EMPLOYEE INFO: " + employee);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee with this id is not present!");
        }
    }

    public void updateEmployee() {
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        boolean found = false;

        System.out.println("""
                Which option would you like to update?
                1. Name
                2. Surname
                3. Age
                4. Designation
                5. Department
                6. Salary""");
        System.out.println();

        for (Employee employee : employeeHashSet) {
            if (employee.getId() == id) {

                int update = scanner.nextInt();
                switch (update) {
                    case 1 -> {
                        System.out.print("Enter name: ");
                        name = scanner.next();
                    }
                    case 2 -> {
                        System.out.print("Enter surname: ");
                        surname = scanner.next();
                    }
                    case 3 -> {
                        System.out.print("Enter age: ");
                        age = scanner.nextInt();
                    }
                    case 4 -> {
                        System.out.print("Enter designation: ");
                        designation = scanner.next();
                    }
                    case 5 -> {
                        System.out.print("Enter department: ");
                        department = scanner.next();
                    }
                    case 6 -> {
                        System.out.print("Enter new salary: ");
                        salary = scanner.nextDouble();
                    }
                    default -> System.out.println("Enter the valid option!");
                }

                employee.setName(name);
                employee.setSurname(surname);
                employee.setAge(age);
                employee.setDesignation(designation);
                employee.setDepartment(department);
                employee.setSalary(salary);

                System.out.println();
                System.out.println("Updated details of employee are:");
                System.out.println(employee);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee is not present!");
        } else {
            System.out.println();
            System.out.println("Employee details updated successfully!");
        }
    }

    public void deleteEmployee() {
        System.out.print("Enter id: ");

        id = scanner.nextInt();
        boolean found = false;
        Employee employeeDelete = null;

        for (Employee employee : employeeHashSet) {
            if (employee.getId() == id) {
                employeeDelete = employee;
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee is not available!");
        } else {
            employeeHashSet.remove(employeeDelete);
            System.out.println("Employee deleted successfully!");
        }
    }

    public void addEmployee() {
        System.out.print("Enter id: ");
        id = scanner.nextInt();

        System.out.print("Enter name: ");
        name = scanner.next();

        System.out.print("Enter surname: ");
        surname = scanner.next();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        System.out.print("Enter designation: ");
        designation = scanner.next();

        System.out.print("Enter department: ");
        department = scanner.next();

        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, surname, age, designation, department, salary);

        employeeHashSet.add(employee);

        System.out.println();
        System.out.println("New employee added successfully!");
        System.out.println();
        System.out.println("EMPLOYEE INFO: " + employee);
    }
}
