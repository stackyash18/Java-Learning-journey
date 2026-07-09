import java.util.Scanner;

public class ToFIndThenFactorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to Find its Factorial: ");
    int num = input.nextInt();

    int Factorial = 1;
    for (int i = 1; i <= num; i++) {
      Factorial = Factorial * i;
    }
    System.out.println("The Factorial of " + num + " is: " + Factorial);
    input.close();
  }
}
