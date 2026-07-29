
/*       **Method Overloading**          */

public class Overloading {
  public int add(int a, int b)
  {
    return a + b;
  }

  public int add(int a, int b, int c)
  {
    return a + b + c;
  }

  public int add(int a, int b, int c, int d)
  {
    return a + b + c + d;
  }

  public String add(String a, String b)
  {
    return a + b;
  }

  public static void main(String args[])
  {
    Overloading over = new Overloading();
    System.out.println(over.add(45,145));
    System.out.println(over.add(44,44,17));
    System.out.println(over.add(25,52,35,24));
    System.out.println(over.add("Ya","sh"));
  }
}
