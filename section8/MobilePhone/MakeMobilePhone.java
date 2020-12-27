package section8.MobilePhone;

import java.util.Scanner;

public class MakeMobilePhone {
  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone mobilePhone = new MobilePhone();

  public static void main(String[] args) {
    System.out.print("Enter your phone number: ");
    String myNumber = scanner.nextLine();
    mobilePhone.setMyNumber(myNumber);

    boolean quit = false;
    while (!quit) {
      System.out.print("Make a selection: ");
      if (!scanner.hasNextInt()) {
        System.out.println("You must enter a number");
        scanner.nextLine();
      } else {
        int selection = scanner.nextInt();
        scanner.nextLine();

        switch (selection) {
          case 0:
            printSelections();
            break;
          case 1:
            addContact();
            break;
          case 2:
            mobilePhone.printContacts();
            break;
          case 3:
            searchContact();
            break;
          case 4:
            deleteContact();
            break;
          case 5:
            updateContact();
            break;
          case 6:
            quit = true;
            break;
          default:
            System.out.println("That is not an valid option");
            break;
        }
      }
    }
  }

  public static void printSelections() {
    System.out.println(
        "0: Print selection options\n1: Add contact\n2: Show contacts\n3: Search contacts\n4: Delete contact\n5: Update contact");
  }

  public static void addContact() {
    System.out.print("Enter a new contact name: ");
    String newContactName = scanner.nextLine();
    System.out.print("Enter a new contact number: ");
    String newContactNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(newContactName, newContactNumber);
    mobilePhone.addNewContact(newContact);
  }

  public static void searchContact() {
    System.out.print("Enter a name to search: ");
    String contactNameToSearch = scanner.nextLine();
    Contact searchResults = mobilePhone.queryContact(contactNameToSearch);
    if (searchResults == null) {
      System.out.println(contactNameToSearch + " is not a contact");
    } else {
      System.out.println(contactNameToSearch + " found. Their number is " + searchResults.getPhoneNumber());
    }
  }

  public static void deleteContact() {
    System.out.print("Enter contact name to delete: ");
    String contactNameToDelete = scanner.nextLine();
    mobilePhone.removeContact(mobilePhone.queryContact(contactNameToDelete));
    System.out.println(contactNameToDelete + " was deleted from contacts");
  }

  public static void updateContact() {
    System.out.print("Enter the name of contact to update: ");
    String contactNameToUpdate = scanner.nextLine();
    Contact contactToUpdate = mobilePhone.queryContact(contactNameToUpdate);

    System.out.print("Enter updated contact name: ");
    String newContactName = scanner.nextLine();

    System.out.print("Enter updated contact number: ");
    String newContactNumber = scanner.nextLine();

    Contact newContact = Contact.createContact(newContactName, newContactNumber);
    mobilePhone.updateContact(contactToUpdate, newContact);
  }
}