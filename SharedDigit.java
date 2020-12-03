// Write a method named hasSharedDigit with two parameters of type int. 
// Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

// EXAMPLE INPUT/OUTPUT:
// * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
// * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
// * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

public class SharedDigit {
  public static void main(String[] args) {
    System.out.println(hasSharedDigit(24, 23));
  }

  public static boolean hasSharedDigit(int n1, int n2) {
    if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
      return false;
    }

    boolean hasSharedDigit = false;
    while (n1 > 0) {
      // break outer loop if inner loop break condition is met
      if (hasSharedDigit) {
        break;
      }
      int lastDigit1 = n1 % 10;
      n1 /= 10;
      // reset second loop num each time first loop runs
      int num2 = n2;
      while (num2 > 0) {
        int lastDigit2 = num2 % 10;
        if (lastDigit1 == lastDigit2) {
          hasSharedDigit = true;
          break;
        }
        num2 /= 10;
      }
    }
    return hasSharedDigit;
  }
}
