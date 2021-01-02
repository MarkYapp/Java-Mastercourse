package section8.ISavable;

import java.util.ArrayList;
import java.util.Scanner;

public class SavableMain {
  public static void main(String[] args) {

    Player player = new Player("Mark", 15, 100);
    Monster monster = new Monster("Wollack", 20, 150);

    printInput(getUserInput());
  }

  public static ArrayList<String> getUserInput() {
    ArrayList<String> userInput = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;

    System.out.print("Options:\n0: Quit\n1: Enter something\nChoose an option ");

    while (!quit) {
      System.out.print("Choose an option ");
      int selection = scanner.nextInt();
      scanner.nextLine();

      switch (selection) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.print("Enter a string: ");
          userInput.add(scanner.nextLine());
          break;
        default:
          System.out.println("Something went wrong");
          quit = true;
          break;
      }
    }
    return userInput;
  }

  public static void printInput(ArrayList<String> input) {
    for (String item : input) {

      System.out.println(item);
    }
  }
}

// In Main, write a method that takes an object that implements the interface as
// a parameter and
// "saves" the values.
// We haven't covered I/O yet, so your method should just print the values to
// the screen.
// Also in Main, write a method that restores the values to a saveable object.
// Again, we are not going to use Java file I/O; instead use the readValues()
// method below to
// simulate getting values from a file – this allows you to type as many values
// as your class
// requires, and returns an ArrayList.