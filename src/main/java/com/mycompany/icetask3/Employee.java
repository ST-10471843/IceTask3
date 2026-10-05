/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask3;

/**
 *
 * @author emeris
 */
// Employee.java

/**
 * An abstract class cannot be instantiated directly and serves as a base for subclasses (Farrell, 2023).
 */
public abstract class Employee {
    // Protected access modifiers allow subclasses to access superclass data fields (Farrell, 2023).
    protected String employeeNumber;
    protected String name;
    protected double basicSalary;

    // A constructor initializes the attributes of an object upon creation (Farrell, 2023)[cite: 3].
    public Employee(String employeeNumber, String name, double basicSalary) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Concrete method to display base details[cite: 3].
    public void displayDetails() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Name: " + name);
        System.out.printf("Basic Salary: R%.2f\n", basicSalary);
    }

    // Abstract method must be overridden by subclasses (Farrell, 2023)[cite: 3].
    public abstract double calculateSalary();
}