package section9.LinkedListChallenge;

public class LinkedListMain {
  public static void main(String[] args) {
    MyLinkedList myList = new MyLinkedList(ListItem item);

    String stringData = "Kangaroo Frog Manatee Elephant Gopher Shark Bat";
    String[] data = animals.split(" ");
    for (String a : data) {
      myList.addItem(a);
    }
  }
}
