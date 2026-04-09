package learn.himanen;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String Email, String phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = Email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(double accountBalance, String email, String phoneNumber) {
        this.accountBalance = accountBalance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {


    }

    public void depositFunds(double value) {
        accountBalance += value;
        System.out.print("Your current balance is" + accountBalance);
    }

    public void withdrawFunds(double value) {

        if (accountBalance - value > 0) {
            accountBalance -= value;
        } else {
            System.out.print(accountBalance + "Your current acc balance is not enough to withdraw.");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
