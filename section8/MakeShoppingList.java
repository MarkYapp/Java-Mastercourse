package section8;

import java.util.Scanner;

public class MakeShoppingList {
  private static Scanner scanner = new Scanner(System.in);
  private static ShoppingList shoppingList = new ShoppingList();

  public static void main(String[] args) {
    printOptions();

    boolean quit = false;
    while (!quit) {
      System.out.print("Make a selection: ");
      int selection = scanner.nextInt();
      scanner.nextLine();

      switch (selection) {
        case 1:
          printOptions();
          break;
        case 2:
          printList();
          break;
        case 3:
          addItem();
          break;
        case 4:
          updateItem();
          break;
        case 5:
          deleteItem();
          break;
        case 6:
          searchItem();
          break;
        case 7:
          System.out.println("Goodbye");
          quit = true;
          break;
        default:
          System.out.println("Something went wrong");
          quit = true;
      }
    }
  }

  public static void printOptions() {
    System.out.println(
        "1: Show options\n2: Print list\n3: Add item\n4: Update an item\n5: Delete an item\n6: Search for an item\n7: Quit");
  }

  public static void printList() {
    shoppingList.getItems();
  }

  public static void addItem() {
    System.out.print("Enter an item to add: ");
    shoppingList.addItem(scanner.nextLine());
  }

  public static void updateItem() {
    System.out.print("Enter item to modify: ");
    String item = scanner.nextLine();
    System.out.print("Enter new item: ");
    String newItem = scanner.nextLine();
    shoppingList.updateItem(item, newItem);
  }

  public static void deleteItem() {
    System.out.print("Enter item to delete: ");
    shoppingList.deleteItem(scanner.nextLine());
  }

  public static void searchItem() {
    System.out.print("Enter an item to search for: ");
    shoppingList.queryItem(scanner.nextLine());
  }
}
