package learn.himanen;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch branch = findBranch(nameOfBranch);

        if (branch == null) {
            return false;
        }
        System.out.printf("Customer details for branch %s%n", nameOfBranch);
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer selectedCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + selectedCustomer.getName() + "[" + (i + 1) + "]");

            if (printTransactions) {
                System.out.println("Transactions");
                for (int j = 0; j < selectedCustomer.getTransactions().size(); j++) {
                    System.out.printf("[%d] Amount %.2f\n", j + 1, selectedCustomer.getTransactions().get(j));
                }

            }
        }
        return true;
    }

    public boolean addBranch(String nameOfBranch) {
        Branch branchId = findBranch(nameOfBranch);
        if (branchId == null) {
            branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double initTransaction) {
        Branch branchId = findBranch(nameOfBranch);
        if (branchId != null) {
            return branchId.addCustomerTransaction(nameOfCustomer, initTransaction);

        }

        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initTransaction) {
        Branch branchId = findBranch(nameOfBranch);
        if (branchId != null) {
            return branchId.newCustomer(nameOfCustomer, initTransaction);
        }

        return false;
    }

    private Branch findBranch(String nameOfBranch) {

        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(nameOfBranch)) {
                return branches.get(i);
            }
        }
        return null;
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

    public boolean newCustomer(String name, double initTransaction) {
        Customer customerID = findCustomer(name);

        if (customerID == null) {
            customers.add(new Customer(name, initTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customerID = findCustomer(name);
        if (customerID != null) {
            customerID.addTransaction(transaction);
            return true;
        }
        return false;

    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return customers.get(i);
            }
        }
        return null;
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