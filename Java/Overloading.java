
/*       **Method Overloading**          */

public class Overloading {
  public int sum(int a, int b)
  {
    return a + b;
  }

  public int sum(int a, int b, int c)
  {
    return a + b + c;
  }

  public int sum(int a, int b, int c, int d)
  {
    return a + b + c + d;
  }

  public String sum(String a, String b)
  {
    return a + b;
  }

  public static void main(String args[])
  {
    Overloading over = new Overloading();
    System.out.println(over.sum(45,145));
    System.out.println(over.sum(44,44,17));
    System.out.println(over.sum(25,52,35,24));
    System.out.println(over.sum("Ya","sh"));
  }
}
