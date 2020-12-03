import java.util.Scanner;

public class MinAndMaxInputChallenge {
  public static void main(String[] args) {
    printMinAndMax();
  }

  public static void printMinAndMax() {
    Scanner scanner = new Scanner(System.in);
    int smallestNum;
    int largestNum;

    while (true) {
      System.out.println("Enter a number");
      if (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        smallestNum = num;
        if (num < smallestNum) {
          smallestNum = num;
        } else if (num > largestNum) {
          largestNum = num;
        }

      } else {
        break;
      }
    }
    System.out.println("The smallest number entered was " + smallestNum);
    System.out.println("The largest number entered was " + largestNum);
  }
}
