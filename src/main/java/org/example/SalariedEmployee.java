package org.example;

public class SalariedEmployee extends Employee {


    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super("john", "today", "01/01/2020");
        this.annualSalary = annualSalary;
    }

    public void retire() {
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        return annualSalary / 26;
    }
}
