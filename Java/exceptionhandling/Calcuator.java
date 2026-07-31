package exceptionhandling;

import java.util.Scanner;

public class Calcuator {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the value of Divident: ");
    int divident = input.nextInt();
    System.out.print("Enter the value of divisor: ");
    int divisor = input.nextInt();
    try
    {
      int division = divident/divisor;
      System.out.println(division);
    } catch(ArithmeticException exception)
    {
      System.out.println("Enter valid values.");
    }
  }
}
