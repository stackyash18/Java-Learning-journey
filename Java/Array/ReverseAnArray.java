package array;

import java.util.Scanner;

public class ReverseAnArray {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Reversing an array");
    int arr[] = ArrayUtility.inputArray();
    reverseArray(arr);
    System.out.println("The reversed array is: ");
    ArrayUtility.displayArray(arr);

    input.close();
  }

  public static void reverseArray(int arr[]) {
    for (int i = 0; i < arr.length / 2; i++) {
      int swap = arr[i];
      arr[i] = arr[(arr.length - 1) - i];
      arr[(arr.length - 1) - i] = swap;
    }
  }
}
