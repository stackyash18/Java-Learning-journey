public class ToFindTheOccurenceInAnArray {
  public static void main(String args[])
  {
    int array[] = {45, 12, 45, 56, 75, 45, 75, 56, 12};

    int target =45;
    int count = 0;


    for(int i=0; i<array.length; i++)
    {

      if(target==array[i])
      {
        count++;
      }
      
    }
    System.out.println(target + "=>" + count);

  }
}
