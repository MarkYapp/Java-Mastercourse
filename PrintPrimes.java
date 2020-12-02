public class PrintPrimes {
  public static void main(String[] args) {
    printPrimes(10, 49);
  }

  public static boolean isPrime(int n) {
    if (n <= 0) {
      return false;
    }
    for (int i = 2; i <= (long) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void printPrimes(int n1, int n2) {
    int count = 0;
    for (int i = n1; i <= n2; i++) {
      if (isPrime(i)) {
        System.out.println(i);
        count++;
      }
      if (count == 3) {
        break;
      }
    }
  }
}
