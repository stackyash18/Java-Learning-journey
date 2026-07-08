
import java.util.Scanner;

public class incomeTaxSlab {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your Annual Income(in lakhs):");
    double annualIncome = input.nextDouble();

    double tax = 0;

    if (annualIncome <= 2.5) {
      System.out.println("You are not required to pay any income tax.");
    }

    else if (annualIncome > 2.5 && annualIncome <= 5) {
      tax = 0.05 * (annualIncome - 2.5);
      System.out.println("Your income tax is: " + tax + " lakhs");
    }

    else if (annualIncome > 5 && annualIncome <= 10) {
      tax = 0.05 * (5 - 2.5) + 0.2 * (annualIncome - 5);
      System.out.println("Your income tax is: " + tax + " lakhs");
    }

    else {
      tax = 0.05 * (5 - 2.5) + 0.2 * (10 - 5) + 0.3 * (annualIncome - 10);
      System.out.println("Your income tax is: " + tax + " lakhs");

    }
    input.close();
  }
}