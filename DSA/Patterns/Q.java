package DSA.Patterns;

/* 
Pattern 17.
     * * * * * * *
       * * * * *
         * * * 
           * 
         * * * 
       * * * * * 
     * * * * * * * 
*/
public class Q {
  public static void main(String args[]) {

    // Part-1
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= (2 * n - 1) - 2 * (i - 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Part-2
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
