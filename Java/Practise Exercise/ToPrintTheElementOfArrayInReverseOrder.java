public class ToPrintTheElementOfArrayInReverseOrder {
  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 50 };

    int n = array.length;

    for (int i = n - 1; i >= 0; i--) {
      System.out.print(array[i]);
    }

  }
}
