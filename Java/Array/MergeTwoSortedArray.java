package Array;

public class MergeTwoSortedArray {
  public static void main(String args[])
  {
    System.out.println("Merging two sorted array.");
    System.out.println("Enter the sorted array1.");
    int arr1[] = ArrayUtility.inputArray();
    System.out.println("Enter the sorted array2.");
    int arr2[] = ArrayUtility.inputArray();

    int newArr[] = mergeArray(arr1, arr2);
    System.out.println("The merged array is: ");
    ArrayUtility.displayArray(newArr);
  }
  public static int[] mergeArray(int arr1[], int arr2[])
  {
    int newArr[] = new int[arr1.length + arr2.length];
    int i=0, j=0, k=0;
    while(i<arr1.length && j<arr2.length)
    {
      if(arr1[i]<=arr2[j])
      {
       newArr[k] = arr1[i];
       i++;
      }
      else
      {
        newArr[k] = arr2[j];
        j++;
      }
      k++;
    }

    while(i<arr1.length)
    {
      newArr[k] = arr1[i];
      i++;
      k++;
    }

    while (j<arr2.length)
    {
      newArr[k] = arr2[j];
      j++;
      k++;
    }
    
    return newArr;
  }
}
