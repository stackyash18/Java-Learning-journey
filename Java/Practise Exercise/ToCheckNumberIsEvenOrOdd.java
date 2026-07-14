import java.util.Scanner;

public class  ToCheckNumberIsEvenOrOdd{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = input.nextInt();

    //Method - 1
    String result = num%2==0?"The given number is Even.":"The given number is Odd";

    System.out.println(result);

    //Method - 2
    if(num%2 == 0)
    {
      System.out.println("The given number is even.");
    }
    else
    {
      System.out.println("The given number is odd.");
    }
    
    input.close();
  }
}
