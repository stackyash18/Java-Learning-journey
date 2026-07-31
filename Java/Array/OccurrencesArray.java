package array;

import java.util.Scanner;

public class OccurrencesArray {
  public static void main(String args[]) {

    System.out.println("Occurrence of a particular element in an array: ");

    int arr[] = ArrayUtility.inputArray();
    System.out.println("Enter the element you want to search: ");
    Scanner input = new Scanner(System.in);
    int searchNum = input.nextInt();

    int occurrences = ToFindOccurrence(arr, searchNum);
    System.out.println("Your element:" + searchNum + " was found " + occurrences + " Times in an array");

    input.close();

  }

  public static int ToFindOccurrence(int arr[], int searchnum) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == searchnum) {
        count++;
      }
    }
    return count;
  }
}