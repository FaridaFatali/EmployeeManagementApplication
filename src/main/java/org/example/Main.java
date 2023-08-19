package org.example;

import java.util.Scanner;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=GEKF890oQYc">...</a>
 * @author Farida Fatali
 * Creating Employee Management System (I changed some things and optimized the app)
 */

public class Main {
    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu(){
        System.out.println("""
                ----------------------
                Choose an option:
                1. Add Employee
                2. View Employee
                3. Update Employee
                4. Delete Employee
                5. View All Employees
                6. Exit""");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        do {
            menu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Add Employee:");
                    System.out.println();
                    service.addEmployee();
                }
                case 2 -> {
                    System.out.println("View Employee");
                    System.out.println();
                    service.viewEmployee();
                }
                case 3 -> {
                    System.out.println("Update Employee");
                    System.out.println();
                    service.updateEmployee();
                }
                case 4 -> {
                    System.out.println("Delete Employee");
                    System.out.println();
                    service.deleteEmployee();
                }
                case 5 -> {
                    System.out.println("View All Employees");
                    System.out.println();
                    service.viewAllEmployees();
                }
                case 6 -> {
                    System.out.println();
                    System.out.println("Thank you for using application!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter valid choice");
            }
        } while (ordering);


    }
}