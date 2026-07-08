package DSA.Patterns;

/* 
Pattern 5.
                  * * * * * *
                  * * * * *
                  * * * *
                  * * *
                  * *
                  * 

*/
public class E {
  public static void main(String args[]) {
    System.out.println();
    System.out.println();
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 6 - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println();
  }
}
