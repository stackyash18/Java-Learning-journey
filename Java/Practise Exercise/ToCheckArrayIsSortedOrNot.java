public class ToCheckArrayIsSortedOrNot {
  public static void main(String args[])
  {
    int array[] = {12,24,36,48,60,72,84,96,108,120};

    boolean sorted = true;
    //program to check the array is sorted or not
    for(int i=0; i<array.length-1; i++)
    {
      if(array[i]>=array[i+1])
      {
        sorted = false;
        break;
      }
    }
    if(sorted==true)
    {
      System.out.println("The array is sorted");
    }
    else
    {
      System.out.println("The array is not sorted.");
    }
  }
}
