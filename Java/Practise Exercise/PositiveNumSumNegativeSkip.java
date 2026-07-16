import java.util.Scanner;

public class PositiveNumSumNegativeSkip {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int arr[] = {12,25,36,45,96,48,75,-95,-69,-188,485,164};
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]>0)
      {
        sum = sum + arr[i];
      }
      else
      {
        continue;
      }
    }

    System.out.println("The sum of the positive number is: " + sum);
    input.close();
  }
}
