public class ToFindMaxAndMinElementInAnArray {
  public static void main(String args[]) {
    int array[] = { 45, 52, 789, 75, 15, 484, 154, 74415, 844,
        5 };

    int maxElement = 0;
   

    for (int i = 0; i < array.length; i++) {
      if (maxElement < array[i]) {
        maxElement = array[i];
      }
    }
    int minElement = maxElement;
    for(int i=0; i<array.length; i++)
    {
      if(array[i]<minElement)
      {
        minElement=array[i];
      }
    }
    System.out.println("The minimum element is: " + minElement);
    System.out.println("The maximum element is: " + maxElement);
  }
}
