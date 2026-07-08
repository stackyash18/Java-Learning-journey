public class ToFindTheAverageOfTheArray {
  public static void main(String[] args) {
    float[] array = { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f };
    float sum = 0;

    for (float element : array) {
      sum += element;
    }
    System.out.println("The Average of an array is : " + sum / array.length);
  }
}
