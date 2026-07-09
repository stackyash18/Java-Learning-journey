public class ToFIndMaxNumInArray {
  public static void main(String[] args) {
    int[] array = { 34, 67, 23, 89, 2, 90, 45, 78 };
    int maxNum = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxNum) {
        maxNum = array[i];
      }
    }
    System.out.println("Maximum number in the array is: " + maxNum);
  }
}
