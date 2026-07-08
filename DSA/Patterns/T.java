package DSA.Patterns;

/* 
Pattern 20.


           A 
         A B A 
       A B C B A 
     A B C D C B A


       */
public class T {
  public static void main(String args[]) {
    int n = 4;
    for (int i = 1; i <= n; i++) {

      // Part-1
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      // Part-2
      for (int j = 1; j <= i; j++) {
        char ch = (char) ('A' + j - 1);
        System.out.print(ch + " ");
      }

      // Part-3
      for (int j = i - 1; j >= 1; j--) {
        char ch = (char) ('A' + j - 1);
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
}
