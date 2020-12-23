package section8.MobilePhone;

import java.util.Scanner;

public class MakeMobilePhone {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter your phone number: ");
    String myNumber = scanner.nextLine();
    MobilePhone mobilePhone = new MobilePhone(myNumber);

    boolean quit = false;
    while (!quit) {
      System.out.print("Make a selection: ");
      int selection = scanner.nextInt();
      scanner.nextLine();

      switch (selection) {
        case 1:
          addContact();
          break;
        case 2:
          mobilePhone.printContacts();
          break;
        case 3:
          quit = true;
          break;
        default:
          System.out.println("There was a problem");
          quit = true;
          break;
      }
    }
  }

  public static void addContact() {
    System.out.print("Enter a new contact name: ");
    String newContactName = scanner.nextLine();
    System.out.print("Enter a new contact number: ");
    String newContactNumber = scanner.nextLine();
    Contact newContact = new Contact(newContactName, newContactNumber);
    // mobilePhone.addNewContact(newContact);
  }
}