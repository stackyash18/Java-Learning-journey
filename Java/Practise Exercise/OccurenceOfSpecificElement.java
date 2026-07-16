import java.util.Scanner;

public class OccurenceOfSpecificElement {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int arr[] = {125,425,488,955,366,366,366,745,412,778};
    int count = 0;
    
    System.out.print("Enter the number you want to search: ");
    int searchNum = input.nextInt();

    for(int num: arr)
    {
      if(num==searchNum)
      {
        count++;
      }
    }
    System.out.println(searchNum + " is repeated " + count + " times.");
    input.close();
  }
}
