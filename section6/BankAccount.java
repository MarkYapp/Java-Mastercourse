package section6;

public class BankAccount {
  private String name;
  private String email;
  private long phone;
  private double accountBalance;

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public long getPhone() {
    return this.phone;
  }

  public double getAccountBalance() {
    return this.accountBalance;
  }

  public double depositFunds(double depositAmount) {
    this.accountBalance += depositAmount;
    System.out.println("Your new balance is: " + this.accountBalance);
    return this.accountBalance;
  }

  public double withdrawFunds(double withdrawAmount) {
    if (withdrawAmount > this.accountBalance) {
      System.out.println("Insufficient funds");
      return -1;
    }
    this.accountBalance -= withdrawAmount;
    System.out.println("Your new balance is: " + this.accountBalance);
    return this.accountBalance;
  }
}
