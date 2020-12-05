package section5;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
  public static void main(String[] args) {
    printMinAndMax();
  }

  public static void printMinAndMax() {
    Scanner scanner = new Scanner(System.in);
    int min = 0;
    int max = 0;
    boolean firstNum = true;
    while (true) {
      System.out.println("Enter a number");
      if (scanner.hasNextInt()) {
        int numberEntered = scanner.nextInt();
        // handle first two entries
        if (firstNum) {
          min = numberEntered;
          max = numberEntered;
          firstNum = false;
        }

        if (numberEntered < min) {
          min = numberEntered;
        } else if (numberEntered > max) {
          max = numberEntered;
        }

      } else {
        break;
      }
      scanner.nextLine();
    }
    scanner.close();
    System.out.println("The smallest number entered was " + min);
    System.out.println("The largest number entered was " + max);
  }
}
