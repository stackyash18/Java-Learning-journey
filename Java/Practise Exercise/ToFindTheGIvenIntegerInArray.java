public class ToFindTheGIvenIntegerInArray {
  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 50 };
    int ToFind = 100;

    boolean found = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == ToFind) {
        found = true;
        break;
      }

      if (array[i] != ToFind && i == array.length - 1) {
        found = false;

      }
    }
    if (found == true)
      System.out.println(ToFind + " is found in the array");
    else
      System.out.println(ToFind + " is not found in the array");
  }
}
