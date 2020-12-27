package section8.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<>();
  }

  public MobilePhone() {
    this.myNumber = "defaultNumber";
    this.myContacts = new ArrayList<>();
  }

  public void setMyNumber(String myNumber) {
    this.myNumber = myNumber;
  }

  public boolean addNewContact(Contact contact) {
    if (myContacts.contains(contact)) {
      return false;
    } else {
      myContacts.add(contact);
      return true;
    }
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    int position = myContacts.indexOf(oldContact);
    if (position < 0) {
      return false;
    } else {
      myContacts.set(position, newContact);
      return true;
    }
  }

  public boolean removeContact(Contact contact) {
    int position = myContacts.indexOf(contact);
    if (position < 0) {
      return false;
    } else {
      myContacts.remove(position);
      return true;
    }
  }

  private int findContact(Contact contact) {
    return myContacts.indexOf(contact);
  }

  private int findContact(String contactName) {
    for (int i = 0; i < myContacts.size(); i++) {
      if (myContacts.get(i).getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }

  public Contact queryContact(String contactName) {
    int position = findContact(contactName);
    return position < 0 ? null : myContacts.get(position);
  }

  public void printContacts() {
    if (myContacts.size() > 0) {
      for (int i = 0; i < myContacts.size(); i++) {
        System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
      }
    } else {
      System.out.println("You don't have any contacts yet. Select 1 to add a contact.");
    }
  }
}
// -  findContact(), has one parameter of type Contact and returns an
// int. The returned value is it's position in the ArrayList, it will either be
// -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
//         -  findContact(), same as above, only it has one parameter of type
// String.
//         -  queryContact(), has one parameter of type String and returns a
// Contact. Use the String to search for the name and then return the Contact.
// Return null otherwise.
//         -  printContacts(), has no parameters and doesn't return anything.
// Print the contacts in the following format:

// Create a program that implements a simple mobile phone with the following
// capabilities.
// 1.  Implement the master class MobilePhone, that holds the ArrayList of
// Contacts, with the following attributes:
//     -  Two fields, a String called myNumber and an ArrayList of type Contact
// called myContacts.
//     -  A constructor that takes a String (the phone number) and initialises
// myNumber and instantiates myContacts.
//     -  And seven methods, they are (their functions are in their names):
//         -  addNewContact(), has one parameter of type Contact and returns a
// boolean. Returns true if the contact doesn't exists, or false if the contact
// already exists.
//         -  updateContact(), has two parameters of type Contact (the old
// contact that will be updated with the new contact) and returns a boolean.
// Returns true if the contact exists and was updated successfully, or false if
// the contact doesn't exists.
//         -  removeContact(), has one parameter of type Contact and returns a
// boolean. Returns true if the contact exists and was removed successfully, or
// false if the contact doesn't exists.
//         -  findContact(), has one parameter of type Contact and returns an
// int. The returned value is it's position in the ArrayList, it will either be
// -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
//         -  findContact(), same as above, only it has one parameter of type
// String.
//         -  queryContact(), has one parameter of type String and returns a
// Contact. Use the String to search for the name and then return the Contact.
// Return null otherwise.
//         -  printContacts(), has no parameters and doesn't return anything.
// Print the contacts in the following format:

// Contact List:
// 1. Bob -> 31415926
// 2. Alice -> 16180339
// 3. Tom -> 11235813
// 4. Jane -> 23571113

// 2. Implement the Contact class with the following attributes:
//     -  Two fields, both String, one called name and the other phoneNumber.
//     -  A constructor that takes two Strings, and initialises name and
// phoneNumber.
//     -  And Three methods, they are:
//         -  getName(), getter for name.
//         -  getPhoneNumber(), getter for phoneNumber.
//         -  createContact(), has two parameters of type String (the persons
// name and phone number) and returns an instance of Contact. This is the only
// method that is static.

// TIP:  In MobilePhone, use findContact() in the other methods (except
// printContacts()) to check if it exists before proceeding.

// TIP:  Two Contact objects are equal if they have the same name.
// TIP:  Be extremely careful about spaces in the printed message.
// NOTE:  All fields are private.
// NOTE:  Constructors should be defined as public.
// NOTE:  All methods should be defined as public (except for the two
// findContact() methods which are private).