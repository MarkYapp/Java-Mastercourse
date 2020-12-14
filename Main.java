import org.w3c.dom.ls.LSOutput;
import section7.Chair;
import section7.Dimensions;
import section7.Door;
import section7.Room;

public class Main {
  public static void main(String[] args) {

  Dimensions dimensions = new Dimensions(10, 12);
  Door door = new Door("white", "in");
  Chair chair = new Chair(2, 2, "Blue");
  Room myRoom = new Room(dimensions, "Carpet", door, chair);
  myRoom.getDoor().openDoor();
  myRoom.getDimensions().getArea();
  myRoom.getChair().moveChair();
  myRoom.getFlooring();
  myRoom.setFlooring("Hardwood");
  myRoom.getFlooring();
  }
}