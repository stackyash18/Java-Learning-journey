import java.util.Scanner;

public class GuessingGame {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    int randomNum = (int)(Math.random()*50)+1;

    System.out.print(randomNum);

    while (true) {
      System.out.print("Guess the number between 1 and 50: ");
      int guessNum = input.nextInt();
      if(randomNum==guessNum)
      {
        System.out.println("Congratulations, you have guess correct number.");
        break;
      }
      else
      {
        System.out.println("Please try again.");
      }
    }
  }
}
