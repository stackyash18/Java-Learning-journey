package Array;

public class SumAndAverage {
  public static void main(String args[]) {
    System.out.println("Calculating sum and average of all the element in 2D array.");
    int arr[][] = ArrayUtility.input2DArray();

    int sum = sumOf2D(arr);

    System.out.println("Sum of all the element in 2D Array: " + sum);

    double avg = average(arr);
    System.out.println("Average of all the elements in 2D Array: " + avg);

  }

  public static double average(int arr[][]) {
    if (arr.length == 0) {
      return 0;
    }
    int rows = arr.length;
    int columns = arr[0].length;
    return sumOf2D(arr) / (rows * columns);
  }

  public static int sumOf2D(int arr[][]) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++)

      {
        sum += arr[i][j];
      }
    }
    return sum;
  }
}
