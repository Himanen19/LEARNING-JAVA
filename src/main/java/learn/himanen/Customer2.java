package learn.himanen;

public class Customer2 extends SimpleCalculator {
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

    public Customer2() {
        this("Gilson", "gilson_ga@gmail.com");
    }

    public Customer2(String name, String emailAddress) {
        this(name, 950.0, emailAddress);

    }

    public Customer2(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}