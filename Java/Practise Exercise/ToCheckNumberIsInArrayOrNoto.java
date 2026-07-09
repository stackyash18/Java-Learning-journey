public class ToCheckNumberIsInArrayOrNoto {
  public static void main(String[] args) {
    float[] array = { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f };
    float num = 4.5f;
    boolean IsInArray = false;

    for (float element : array) {
      if (num == element) {
        IsInArray = true;
        break;
      }
    }
    if (IsInArray) {
      System.out.println("The value is present in the array.");
    } else {
      System.out.println("The value is not present in the array.");
    }
  }
}
