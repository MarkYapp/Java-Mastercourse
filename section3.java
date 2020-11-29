public class section3 {

  public static void main(String[] args) {

    // Lesson 27
    byte maxByte = Byte.MAX_VALUE;
    System.out.println(maxByte);
    short maxShort = Short.MAX_VALUE;
    System.out.println(maxShort);
    int maxInt = Integer.MAX_VALUE;
    System.out.println(maxInt);

    byte newByte = 125;

    short newShort = 32_000;

    int newInt = 2147483646;

    long newLong = 50000 + (10 * (newByte + newShort + newInt));

    System.out.println("newLong = " + newLong);

    // Lesson 28
    double numPounds = 200d;
    double numKilos = numPounds * 0.45359237;
    System.out.println("Converted weight = " + numKilos);

    // Lesson 39
    double myDouble = 20.00d;
    double mySecondDouble = 80.00d;
    double myThirdDouble = (myDouble + mySecondDouble) * 100.00d;
    double remainder = myThirdDouble % 40.00d;
    System.out.println("remainder = " + remainder);
    boolean isRemainderZero = remainder == 0 ? true : false;
    System.out.println(isRemainderZero);
    if (!isRemainderZero) {
      System.out.println("Got some remainder");
    }
  }
}
