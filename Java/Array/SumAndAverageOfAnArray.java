package Array;

class SumAndAverageOfAnArray {
  public static void main(String args[]) {
    System.out.println("Array Sum and Average.");
    int arr[] = ArrayUtility.inputArray();

    long sum = sum(arr);
    int avg = avg(arr);

    System.out.println("Sum of the elements is: " + sum);
    System.out.println("The average of the element is: " + avg);

  }

  public static long sum(int[] arr) {
    long sum = 0;
    int i = 0;
    while (i < arr.length) {
      sum += arr[i];
      i++;
    }
    return sum;
  }

  public static int avg(int[] arr) {
    long sum = sum(arr);
    int avg = (int) (sum / arr.length);
    return avg;
  }
}
