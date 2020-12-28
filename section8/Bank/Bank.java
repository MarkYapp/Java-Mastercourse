package section8.Bank;

import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<>();
  }

  public boolean addBranch(String name) {
    if (findBranch(name) != null) {
      System.out.println(name + " branch already exists. Branch add unsuccessful");
      return false;
    }
    branches.add(new Branch(name));
    System.out.println(name + " branch successfully added");
    return true;
  }

  public boolean addCustomer(String branchName, String name, double initialTransaction) {
    Branch branch = findBranch(branchName);
    if (branch.findCustomer(name) == null) {
      return branch.newCustomer(name, initialTransaction);
    }
    System.out.println("Customer already exists at this branch");
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String name, double transaction) {
    Branch branch = findBranch(branchName);
    Customer customer = branch.findCustomer(name);
    if (customer == null) {
      System.out.println("Customer record does not exist");
      return false;
    }
    System.out.println(transaction + " deposited for customer " + customer.getName());
    return branch.addCustomerTransaction(name, transaction);
  }

  public Branch findBranch(String branchName) {
    for (int i = 0; i < branches.size(); i++) {
      if (branches.get(i).getName().equals(branchName)) {
        return branches.get(i);
      }
    }
    return null;
  }

  public boolean listCustomers(String branchName, boolean printTransactions) {
    Branch branch = findBranch(branchName);
    if (branch == null) {
      return false;
    } else {
      ArrayList<Customer> customers = branch.getCustomers();
      for (int i = 0; i < customers.size(); i++) {
        System.out.println(customers.get(i).getName());
        if (printTransactions) {
          System.out.println(customers.get(i).getTransactions());
        }
      }
      return true;
    }
  }
}