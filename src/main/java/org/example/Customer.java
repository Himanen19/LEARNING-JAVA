package org.example;

public class Customer extends SimpleCalculator {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer() {
        this("Gilson", "gilson_ga@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 950.0, emailAddress);

    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}