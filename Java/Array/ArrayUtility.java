
package Array;

import java.util.Scanner;

class ArrayUtility {


  public static int[] inputArray() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of element: ");
    int n = input.nextInt();

    if (n <= 0) {
      System.out.println("Enter a valid number of elements");
      System.exit(n);
    }

    int[] arr = new int[n];
    int i = 0;
    while (i < n) {
      System.out.println("Please enter the element no." + (i + 1) + ":");
      arr[i] = input.nextInt();
      i++;
    }
    return arr;
  }

  public static void displayArray(int arr[])
  {
    for(int i=0; i<arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
