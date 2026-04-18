package learn.himanen;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(nameOfBranch)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String nameOfBranch) {
        Branch id = findBranch(nameOfBranch);
        if (id == null) {
            return branches.add(new Branch(nameOfBranch));
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initTransacton) {
        Branch id = findBranch(nameOfBranch);
        if (id != null) {
            return id.newCustomer(nameOfCustomer, initTransacton);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch id = findBranch(nameOfBranch);
        if (id != null) {
            return id.addCustomerTransaction(nameOfCustomer, transaction);
        }
        return false;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");

                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        // O segredo está no java.util.Locale.US
                        System.out.format(java.util.Locale.US, "[%d]  Amount %.2f%n", (j + 1), transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}

class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String nameOfCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(nameOfCustomer)) {

                return customers.get(i);
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        Customer id = findCustomer(nameOfCustomer);
        if (id != null) {
            id.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public boolean newCustomer(String nameOfCustomer, double initTransaction) {
        Customer id = findCustomer(nameOfCustomer);
        if (id == null) {
            return customers.add(new Customer(nameOfCustomer, initTransaction));
        }
        return false;
    }
}

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        transactions = new ArrayList<>();
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}