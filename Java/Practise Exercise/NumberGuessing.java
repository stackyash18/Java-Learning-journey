import java.util.Scanner;

public class NumberGuessing {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int num = 25,guess; 
    do
    {
      System.out.print("Please guess the number between 1 and 30: ");
      guess = input.nextInt();
    } while(num != guess);
    System.out.println("You have successfully guessed the number.");
  }
}
