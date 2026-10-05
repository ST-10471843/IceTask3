/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask3;

/**
 *
 * @author emeris
 */

public class SalaryCalculatorApp {
    public static void main(String[] args) {
        // Polymorphism allows a superclass reference to hold a subclass object (Farrell, 2023).
        
        // Create one PermanentEmployee with a basic salary of R20 000[cite: 3].
        Employee permEmployee = new PermanentEmployee("PE001", "Alice Smith", 20000.00);
        
        // Create one ContractEmployee with a basic salary of R15 000[cite: 3].
        Employee contractEmployee = new ContractEmployee("CE001", "Bob Jones", 15000.00);
        
        System.out.println("--- Permanent Employee Details ---");
        permEmployee.displayDetails();
        // Displays calculated final salary which is expected to be R16 400 after a R3 600 tax deduction[cite: 3, 4].
        System.out.printf("Final Salary: R%.2f\n\n", permEmployee.calculateSalary());
        
        System.out.println("--- Contract Employee Details ---");
        contractEmployee.displayDetails();
        // Displays calculated final salary which is expected to be R16 500 after a R1 500 allowance addition[cite: 3, 4].
        System.out.printf("Final Salary: R%.2f\n", contractEmployee.calculateSalary());
    }
}
