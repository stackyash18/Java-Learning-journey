import java.util.Scanner;

public class MinimumFromTwoNumber {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = input.nextInt();
    System.out.println("Enter the second number: ");
    int b = input.nextInt();

    // in this question i have only two variable so ternary operator woubld be the best choice for simplicity.

    int minNumber = a<b?a:b;
    System.out.println(minNumber + " is the smaller number.");

    input.close();
  }
}
