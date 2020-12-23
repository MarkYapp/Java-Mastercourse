package section8;

import java.util.ArrayList;

public class ShoppingList {
  private ArrayList<String> shoppingList = new ArrayList<>();

  public void getItems() {

    System.out.println("There are " + shoppingList.size() + " items in the list.");
    for (int i = 0; i < shoppingList.size(); i++) {
      System.out.println(shoppingList.get(i));
    }
  }

  public void addItem(String item) {
    shoppingList.add(item);
    System.out.println(item + " was added to the list");
  }

  public void updateItem(String item, String newItem) {
    if (!shoppingList.contains(item)) {
      System.out.println(item + " is not on the list");
    } else {
      int position = shoppingList.indexOf(item);
      shoppingList.set(position, newItem);
      System.out.println(item + " was changed to " + newItem);
    }
  }

  public void deleteItem(String item) {
    int position = shoppingList.indexOf(item);
    shoppingList.remove(position);
    System.out.println(item + " was removed");
  }

  public void queryItem(String item) {
    boolean isInList = shoppingList.contains(item);
    System.out.println(isInList ? item + " is in the list" : item + " is not in the list");
  }
}
