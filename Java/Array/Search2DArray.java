package Array;

import java.util.Scanner;

public class Search2DArray {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Searching in 2D array. ");

    int arr[][] = ArrayUtility.input2DArray();
    System.out.print("Enter the number you want to search: ");
    int searchNum = input.nextInt();
    boolean isFound = search2D(arr, searchNum);
    if (isFound) {
      System.out.println("Number was found.");
    } else {
      System.out.println("Number was not found.");
    }
    input.close();
  }

  public static boolean search2D(int arr[][], int searchNum) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; i++) {
        if (arr[i][j] == searchNum) {
          return true;
        }
      }
    }
    return false;
  }
}
