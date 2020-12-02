public class Sum3and5 {
  public static void main(String[] args) {
    sum3and5();
  }

  public static void sum3and5() {
    int count = 0;
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i);
        sum += i;
        count++;
      }
      if (count == 5) {
        break;
      }
    }
    System.out.println(sum);
  }
}
