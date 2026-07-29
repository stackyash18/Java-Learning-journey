public class PassByValue {

  public static int add(int a, int b)
  {
    a = 101;
    return a + b;
  }
  public static void main(String args[])
  {
    int x =  45;
    int y = 56;
    int sum = add(x,y);
    System.out.println("The value of x is " + x + ", y is " + y  + " and sum is "  + sum);
  }
}
