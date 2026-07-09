public class SumOfArray {
  public static void main(String[] args) {
    float[] array = { 1.5f, 2.5f, 3.5f, 4.5f };

    int n = array.length;

    float sum = 0;

    for (int i = 0; i < n; i++) {
      sum += array[i];
    }

    System.out.println("Sum of all elements in the array is: " + sum);
  }
}