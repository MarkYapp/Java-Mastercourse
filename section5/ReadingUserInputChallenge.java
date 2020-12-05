package section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
  public static void main(String[] args) {
    System.out.println("The sum of entered numbers is " + readInput());
  }

  public static int readInput() {
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int sum = 0;
    while (count <= 4) {
      System.out.println("Enter number #" + count + ":");
      if (scanner.hasNextInt()) {
        int userEnteredNum = scanner.nextInt();
        sum += userEnteredNum;
        count++;
      } else {
        System.out.println("Invalid entry");
      }
      scanner.nextLine();
    }
    scanner.close();
    return sum;
  }
}
