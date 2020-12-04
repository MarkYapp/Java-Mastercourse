// Write a method named hasSameLastDigit with three parameters of type int. 
// Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
// The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

// EXAMPLE INPUT/OUTPUT:
// * hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
// * hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
// * hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

// Write another method named isValid with one parameter of type int.
// The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

// EXAMPLE INPUT/OUTPUT
// * isValid(10); → should return true since 10 is within the range of 10-1000
// * isValid(468); → should return true since 468 is within the range of 10-1000
// * isValid(1051); → should return false since 1051 is not within the range of 10-1000

public class LastDigitChecker {
  public static void main(String[] args) {
    System.out.println(hasSameLastDigit(41, 22, 71));
  }

  public static boolean hasSameLastDigit(int n1, int n2, int n3) {
    if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
      return false;
    }
    int lastDigit1 = n1 % 10;
    int lastDigit2 = n2 % 10;
    int lastDigit3 = n3 % 10;
    boolean hasSameLastDigit = false;
    if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
      hasSameLastDigit = true;
    }
    return hasSameLastDigit;
  }

  public static boolean isValid(int num) {
    boolean isValid = true;
    if (num < 10 || num > 1000) {
      isValid = false;
    }
    return isValid;
  }
}
