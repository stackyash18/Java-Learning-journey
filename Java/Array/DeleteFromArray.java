package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DeleteFromArray {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Array deletion.");
    int arr[] = ArrayUtility.inputArray();

    System.out.println("Enter the number which you want to delete: ");
    int delNum = input.nextInt();

    int newArr[] = toDeleteElement(arr, delNum);

    System.out.print("New Array: ");
    ArrayUtility.displayArray(newArr);
  }

  public static int[] toDeleteElement(int arr[], int delNum)
  {
    int occ = OccurrencesArray.ToFindOccurrence(arr, delNum);
    if(occ==0)
    {
      return arr;
    }
    int newSize = arr.length - occ;
    int [] newArr = new int[newSize];

    int i=0, j=0;
    while(i<arr.length)
    {
      if(arr[i]!=delNum)
      {
        newArr[j] = arr[i];
        j++;
      }
      i++;
    }
    return newArr;
  }
}
