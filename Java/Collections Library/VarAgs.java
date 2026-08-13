public class VarAgs {
  public static void main(String args[])
  {
    System.out.println(sum(10, 45,42,655,656,664,5456));
  }

  public static long sum(int a, int b, int... numbers)
  {
    long sum = a + b;

    for(int number: numbers)
    {
      sum += number;
    }
    return sum;
  }
}
