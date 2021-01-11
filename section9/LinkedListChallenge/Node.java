package section9.LinkedListChallenge;

public class Node extends ListItem {
  public Node(Object value) {
    super(value);
  }

@Override
  private ListItem next() {
    return // item to right;
  }

@Override
  private setNext(ListItem item) {
    
  }

@Override
  private previous() {

  }

@Override
  private setPrevious() {

  }

@Override
  private int compareTo(ListItem) {

  }
}

// 2.  Node (concrete class)
//     -  It extends ListItem.
//     -  It has a constructor that takes an Object, then calls its parent
// constructor with the parameter that was passed in.
//     -  And five methods which are package-private:

//         -  next(), takes no parameters and returns the ListItem to its right.

//         -  setNext(), takes a ListItem and sets it as its rightLink.

//         -  previous(), takes no parameters and returns the ListItem to its
// left.

//         -  setPrevious(), takes a ListItem and sets it as its leftLink.

//         -  compareTo(), takes a ListItem and compares it to the ListItem that
// called this method. Use value from ListItem for comparison. If this value is
// greater than the value that was passed in, then it should return a number
// greater than zero. If vice versa, then it should return a number less than
// zero, and zero if equal.