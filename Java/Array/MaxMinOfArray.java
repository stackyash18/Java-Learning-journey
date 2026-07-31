package array;

import java.util.Scanner;

public class MaxMinOfArray {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("<--Finding minimum and maximum element of an array-->");

    int arr[] = ArrayUtility.inputArray();

    int maxElement = maxElement(arr);
    int minElement = minElement(arr);

    System.out.println("The maximum element in an array: " + maxElement);
    System.out.println("The minimum element in an array: " + minElement);
    input.close();
  }

  public static int maxElement(int arr[]) {
    int maxElement = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxElement) {
        maxElement = arr[i];
      }
    }
    return maxElement;
  }

  public static int minElement(int arr[]) {
    int minElement = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < minElement) {
        minElement = arr[i];
      }
    }
    return minElement;
  }
}
