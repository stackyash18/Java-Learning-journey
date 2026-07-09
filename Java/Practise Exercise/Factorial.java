public class Factorial {
  static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    int n = 5;
    int result = factorial(n);
    System.out.println("Factorial of " + n + " is: " + result);

    int n2 = 7;
    int result2 = 1;
    for (int i = n2; i >= 1; i--) {
      result2 *= i;
    }
    System.out.println("Factorial of " + n2 + " is: " + result2);
  }
}
