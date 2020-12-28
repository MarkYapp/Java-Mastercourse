package section8.Bank;

import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Customer> getCustomers() {
    return this.customers;
  }

  public boolean newCustomer(String name, double initialTransaction) {
    if (findCustomer(name) != null) {
      System.out.println(name + " is already an existing customer.");
      return false;
    }
    customers.add(new Customer(name, initialTransaction));
    return true;
  }

  public boolean addCustomerTransaction(String name, double transaction) {
    Customer customer = findCustomer(name);
    if (customer == null) {
      return false;
    }
    customer.addTransaction(transaction);
    return true;
  }

  public Customer findCustomer(String customerName) {
    for (int i = 0; i < customers.size(); i++) {
      Customer customer = customers.get(i);
      if (customer.getName().equals(customerName)) {
        return customer;
      }
    }
    return null;
  }
}