/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask3;

/**
 *
 * @author emeris
 */

public class ContractEmployee extends Employee {

    public ContractEmployee(String employeeNumber, String name, double basicSalary) {
        super(employeeNumber, name, basicSalary);
    }

    /**
     * Calculates final salary by adding a 10% contract allowance to the basic salary[cite: 3].
     */
    @Override
    public double calculateSalary() {
        double contractAllowance = basicSalary * 0.10; 
        return basicSalary + contractAllowance;
    }
}