public class ToFindMinNumInArray {
  public static void main(String[] args) {
    int[] array = { 45, 52, -4503, 654, 412, 485, 965, 862 };
    int minNum = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < minNum) {
        minNum = array[i];
      }
    }
    System.out.println("Minimum number in the array is: " + minNum);
  }
}
