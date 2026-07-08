package DSA.Patterns;

/* 
Pattern 10.
        * 
      * * * 
    * * * * *
  * * * * * * *
    * * * * * 
      * * * 
        * 
*/
public class J {
  public static void main(String args[]) {
    // Part 1
    int n = 4;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Part-2
    int m = 3;
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= 7 - 2 * i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
