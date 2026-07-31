
package array;

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

  public static int[][] input2DArray() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the no of rows: ");
    int rows = input.nextInt();

    System.out.println("Enter the no of columns: ");
    int columns = input.nextInt();

    int arr[][] = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.println("Enter the element in row: " + (i + 1) + "\ncolumns: " + (j + 1));
        arr[i][j] = input.nextInt();
      }
    }
    return arr;
  }

  public static int[][] input2DArrayDiagonal() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the no of rows: ");
    int rows = input.nextInt();

    System.out.println("Enter the no of columns: ");
    int columns = input.nextInt();

    if (rows != columns) {
      System.out.println("Kindly print the same no. of rows and columns.");
      return null;
    }

    int arr[][] = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.println("Enter the element in row: " + (i + 1) + "\ncolumns: " + (j + 1));
        arr[i][j] = input.nextInt();
      }
    }
    return arr;
  }

  public static void displayArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
