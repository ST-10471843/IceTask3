/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask3;

/**
 *
 * @author emeris
 */
// PermanentEmployee.java

/**
 * A subclass inherits attributes and methods from a superclass using the 'extends' keyword, 
 * and implements interfaces using the 'implements' keyword (Farrell, 2023)[cite: 3].
 */
public class PermanentEmployee extends Employee implements Taxable {

    public PermanentEmployee(String employeeNumber, String name, double basicSalary) {
        // The super() statement passes parameters to the superclass constructor (Farrell, 2023).
        super(employeeNumber, name, basicSalary);
    }

    /**
     * Overriding forces the subclass to implement the interface's abstract method (Farrell, 2023).
     * Calculates tax as 18% of the basic salary[cite: 3].
     */
    @Override
    public double calculateTax() {
        return basicSalary * 0.18; 
    }

    /**
     * Calculates the final salary by subtracting tax from the basic salary[cite: 3].
     */
    @Override
    public double calculateSalary() {
        return basicSalary - calculateTax();
    }
}