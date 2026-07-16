public class BreakAndContinue {
  public static void main(String args[])
  {
    System.out.println("Before loop.");
    for(int i=0; i<1000; i++)
    {
      //Break statement
      if(i==101)
      {
        break;
      }
      //Continue statement
      if(i==10)
      {
        continue;
      }
      System.out.println(i);
    }
    System.out.println("Out of loop.");
  }
}
