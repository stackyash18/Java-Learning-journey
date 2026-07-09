import java.util.Scanner;

public class TableOfnNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number of which you want to print the Table:");
    int n = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n * i));
    }
    input.close();
  }
}