package section6;

public class VipAccount {
  private String name;
  private String email;
  private double creditLimit;

  VipAccount(String name, String email, double creditLimit) {
    this.setName(name);
    this.setEmail(email);
    this.setCreditLimit(creditLimit);
  }

  VipAccount(String name, String email) {
    this(name, email, 100000);
  }

  VipAccount() {
    this("defaultName", "defaultEmail", 100000);
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
