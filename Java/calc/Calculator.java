package calc;

class SimpleCalculator {
  protected int proInt = 4;
  int defInt = 5;

  public void addNum(int a, int b) {
    System.out.println("Your Result is: " + (a + b));
  }

  public void minusNum(int a, int b) {
    System.out.println("Your Result is: " + (a - b));
  }

  public void multNum(int a, int b) {
    System.out.println("Your Result is: " + (a * b));
  }

  public void divNum(int a, int b) {
    System.out.println("Your Result is: " + (a / b));
  }
}

class ScCalculator {
  public void sumOfSin(int a, int b) {
    System.out.println("The Value of sin(a+b) is:  " + Math.sin(a + b));
  }

  public void diffOfSin(int a, int b) {
    System.out.println("The Value of sin(a-b) is:  " + Math.sin(a - b));
  }

  public void sumOfCos(int a, int b) {
    System.out.println("The Value of cos(a+b) is:  " + Math.cos(a + b));
  }

  public void diffOfCos(int a, int b) {
    System.out.println("The Value of cos(a-b) is:  " + Math.cos(a - b));
  }
}

class HybCalc {
  public void calcInterest(int noOfYears, float rate, int principalAmount) {
    float interest = (rate / 100) * principalAmount;
    float totalAmount = principalAmount + interest * noOfYears;
    System.out.println("The Total Amount is:  " + totalAmount);
  }
}

public class Calculator {
  public static void main(String args[]) {

    System.out.println("This is Calculator");
  }
}
