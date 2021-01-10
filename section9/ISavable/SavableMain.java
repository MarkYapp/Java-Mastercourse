package section9.ISavable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavableMain {
  public static void main(String[] args) {

    Player mark = new Player("Mark", 15, 100);
    Monster wollack = new Monster("Wollack", 20, 150);

    saveState(mark);
    saveState(wollack);

    loadState(wollack);
    saveState(wollack);
  }

  public static ArrayList<String> getUserInput() {
    ArrayList<String> userInput = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;

    System.out.print("Options:\n0: Quit\n1: Enter something\nChoose an option: ");

    while (!quit) {
      int selection = scanner.nextInt();
      scanner.nextLine();

      switch (selection) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter a string: ");
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

  public static void saveState(ISavable character) {
    for (int i = 0; i < character.write().size(); i++) {
      System.out.println("Saving " + character.write().get(i));
    }
  }

  public static void loadState(ISavable character) {
    ArrayList<String> userInput = getUserInput();
    character.read(userInput);
  }
}
