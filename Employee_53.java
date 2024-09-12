/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee_53;

/**
 *
 * @author pc
 */
public class Employee_53 {

    private String name;
    private int id;
    private double salary;
    private String designation;
    
    public Employee_53(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }
    public Employee_53(String name, int id) {
        this(name, id, 0.0, "Not specified");
    }

    public Employee_53(String name) {
        this(name, 0, 0.0, "Not specified");
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Designation: " + designation);
    }
    public void displayInfo(boolean showNameAndDesignation) {
        if (showNameAndDesignation) {
            System.out.println("Name: " + name + ", Designation: " + designation);
        } else {
            displayInfo();
        }
    }
    public static void main(String[] args) {
        Employee_53 emp1 = new Employee_53("Bushra", 201, 75000.00, "Software Engineer");
        Employee_53 emp2 = new Employee_53("Ayman", 202);
        Employee_53 emp3 = new Employee_53("Tisha");
        emp1.displayInfo();
        emp2.displayInfo(); 
        emp3.displayInfo(true); 
    }
}

