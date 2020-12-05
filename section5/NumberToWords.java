package section5;

public class NumberToWords {
  public static void main(String[] args) {
    numberToWords(1090);
  }

  public static void numberToWords(int num) {
    if (num < 0) {
      System.out.println("Invalid Value");
    } else {

      int reverseNum = reverse(num);
      int reverseNumLength = getDigitCount(reverseNum);
      int lastDigit;
      do {
        lastDigit = reverseNum % 10;
        switch (lastDigit) {
          case 0:
            System.out.println("Zero");
            break;
          case 1:
            System.out.println("One");
            break;
          case 2:
            System.out.println("Two");
            break;
          case 3:
            System.out.println("Three");
            break;
          case 4:
            System.out.println("Four");
            break;
          case 5:
            System.out.println("Five");
            break;
          case 6:
            System.out.println("Six");
            break;
          case 7:
            System.out.println("Seven");
            break;
          case 8:
            System.out.println("Eight");
            break;
          default:
            System.out.println("Nine");
            break;

        }
        reverseNum /= 10;
      } while (reverseNum > 0);
      // compare number of digits from original to reversed num
      int differenceInDigits = getDigitCount(num) - reverseNumLength;
      for (int i = 0; i < differenceInDigits; i++) {
        System.out.println("Zero");
      }
    }
  }

  public static int reverse(int num) {
    int lastDigit;
    int reverseNum = 0;
    while (num != 0) {
      reverseNum *= 10;
      lastDigit = num % 10;
      reverseNum += lastDigit;
      num /= 10;
    }
    return reverseNum;
  }

  public static int getDigitCount(int num) {
    if (num < 0) {
      return -1;
    } else if (num == 0) {
      return 1;
    }
    int count = 0;
    while (num > 0) {
      num /= 10;
      count++;
    }
    return count;
  }
}