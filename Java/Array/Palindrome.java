package Array;

public class Palindrome {
  public static void main(String args[])
  {
    System.out.println("Palindrome checker");
    int arr[] = ArrayUtility.inputArray();
    boolean isPalin = isPalndrome(arr);
    if(isPalin)
    {
      System.out.println("The number is palindrome.");
    }
    else
    {
      System.out.println("The number is not palindrome.");
    }
    
  }

  public static boolean isPalndrome(int arr[])
  {
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]!=arr[(arr.length-1)-i])
      {
        return false;
      }
    }
    return true;
  }

}
