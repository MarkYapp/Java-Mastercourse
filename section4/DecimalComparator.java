// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
// The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

// EXAMPLES OF INPUT/OUTPUT:
// * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
// * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
// * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
// * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

// TIP: Use paper and pencil.
// TIP: Use casting.
// NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
package section4;

public class DecimalComparator {
  public static void main(String[] args) {
    boolean result1 = areEqualByThreeDecimalPlaces(-3.1756, -3.175); // true
    System.out.println(result1);
    boolean result2 = areEqualByThreeDecimalPlaces(3.176, 3.175); // false
    System.out.println(result2);
  }

  public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
    boolean areDifferentSigns = numOne < 0 && numTwo > 0 || numOne > 0 && numTwo < 0 ? true : false;
    if (areDifferentSigns) {
      return false;
    }

    int numOneInt;
    int numTwoInt;
    if (numOne < 0 || numTwo < 0) {
      numOneInt = (int) Math.ceil(numOne * 1000);
      numTwoInt = (int) Math.ceil(numTwo * 1000);

    } else {
      numOneInt = (int) Math.floor(numOne * 1000);
      numTwoInt = (int) Math.floor(numTwo * 1000);
    }
    if (numOneInt == numTwoInt) {
      return true;
    } else {
      return false;
    }
  }
}
