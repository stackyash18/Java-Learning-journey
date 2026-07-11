package Array;

public class SumAndAverage {
  public static void main(String args[])
  {
    System.out.println("Calculating sum and average of all the element in 2D array.");
    int arr[][] = ArrayUtility.input2DArray();

    int sum = SumOf2D(arr);


    System.out.print("Sum of all the element in 2D Array: " + sum);

  }

  public static int SumOf2D(int arr[][])
  {
    int sum = 0;

    for(int i=0; i<arr.length; i++)
    {
      for(int j=0; j<arr[i].length; j++)

        {
          sum+=arr[i][j];
        }
    }
    return sum;
  }
}
