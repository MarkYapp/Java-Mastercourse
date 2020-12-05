package section5;

public class InchesToCentimers {
  public static void main(String[] args) {
    double result1 = calcFeetAndInchesToCentimeters(4, 10);
    System.out.println("result1 = " + result1);
    double result2 = calcFeetAndInchesToCentimeters(58);
    System.out.println("result2 = " + result2);
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12) {
      return -1;
    }
    // 1 inch = 2.54cm
    double centimeters = (feet * 12 + inches) * 2.54;
    return centimeters;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }
    double calculatedFeet = Math.floor(inches / 12);
    double calculatedInches = inches % 12;
    return calcFeetAndInchesToCentimeters(calculatedFeet, calculatedInches);
  }
}
