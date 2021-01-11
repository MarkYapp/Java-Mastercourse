package section9.LinkedListChallenge;

public class SearchTree implements NodeList {
  private ListItem root;

  public SearchTree(ListItem item) {
    this.root = item;
  }

  public ListItem getRoot() {
    return this.root;
  };

  public boolean addItem() {
  };

  public boolean removeItem() {
  };

  public void traverse(ListItem root) {
  };

  private void performRemoval(ListemItem item1, ListItem item2) {

  }
}

// 5.  SearchTree (concrete class)

//     -  It implements NodeList.

//     -  It has one field of type ListItem called root.

//     -  A constructor that takes a ListItem and initialises the field root
// with the newly passed in parameter.

//     -  And five methods:

//         -  getRoot(), getter for root.

//         -  addItem(), same as MyLinkedList.

//         -  removeItem(), same as MyLinkedList.

//         -  performRemoval(), takes two ListItems, the item to be removed and
// its parent. It doesn't return anything and is declared as private. Call this
// method from removeItem() when the item is found.

//         -  traverse(), takes the root as an argument and does not return
// anything. It uses recursion to visit all the branches in the tree (Inorder).
// Print each value on a seperate line.