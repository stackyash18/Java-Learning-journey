package DSA.Patterns;

/*
Pattern 12.

          *             *
          * *         * *
          * * *     * * *
          * * * * * * * *
          * * * * * * * *
          * * *     * * *
          * *         * *
          *             *
          

          */
public class L {
  public static void main(String args[]) {

    // Upper Part-1
    int n = 3;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print("  ");
      }

      // Upper part-2
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Middle Part
    int m = 2;

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= 8; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Lower Part-1
    int o = 3;
    for (int i = 1; i <= o; i++) {
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print("* ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }

      // Lower Part-2
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
