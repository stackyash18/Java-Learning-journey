package yash;

class Working {
  public int y = 5;
  protected int x = 4;
  int z = 7;
  private int c = 10;

  public void meth() {
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(c);
  }
}

public class AccessModifier {
  public static void main(String args[]) {
    Working w1 = new Working();
    System.out.println(w1.y);
    System.out.println(w1.z);
    // System.out.println(w1.c); ~~ This Variable can't be accessed in same package
    // because it has private access modifier.
    w1.meth();
  }

}

/*
 * 
 * Summary ~~Access Modifier
 * 
 * Modifier Class Package Subclass World
 * 1.Public Y Y Y Y
 * 2.Protected Y Y Y Y
 * 3.Default Y Y N N
 * 4.Private Y N N N
 * 
 */
