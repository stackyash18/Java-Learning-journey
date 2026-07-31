package array;

public class SumOfTwoDiagonalElement {
  public static void main(String args[]) {
    System.out.println("Sum of two diagonal");
    int arr[][] = ArrayUtility.input2DArrayDiagonal();
    long sum = sumOfDiagonal(arr);
    System.out.println("Sum of both the diagonal is: " + sum);
  }

  public static long sumOfDiagonal(int arr[][]) {
    long leftSum = sumOfLeftDiagonal(arr);
    long rightSum = sumOfRightDiagonal(arr);
    long sum = leftSum + rightSum;
    if (arr.length % 2 != 0) {
      int ind = arr.length / 2;
      sum -= arr[ind][ind];
    }
    return sum;
  }

  public static long sumOfLeftDiagonal(int arr[][]) {
    long leftSum = 0;
    for (int i = 0; i < arr.length; i++) {
      leftSum += arr[i][i];
    }
    return leftSum;
  }

  public static long sumOfRightDiagonal(int arr[][]) {
    long rightSum = 0;
    for (int i = 0; i < arr.length; i++) {
      int col = arr.length - 1 - i;
      rightSum += arr[i][col];
    }
    return rightSum;
  }
}
