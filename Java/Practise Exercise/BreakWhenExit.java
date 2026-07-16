import java.util.Scanner;

public class BreakWhenExit {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    while(true)
    {
      System.out.print("Enter anything(it will exit when you type exit): ");
      String anything = input.next();
      if(anything.equalsIgnoreCase("exit"))
      {
        break;
      }
    }
    System.out.println("You have entered exit.");
    input.close();
  }
}
