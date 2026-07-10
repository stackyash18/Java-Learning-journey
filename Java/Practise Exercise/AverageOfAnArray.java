public class AverageOfAnArray {
 public static void main(String args[])
 {
  float[]  array ={2.54f, 3.24f, 8.12f, 9.45f, 54.15f};

  int n=array.length;

  float sum = 0;

  for(int i=0; i<n; i++)
  {
    sum += array[i];
  }

  float average = sum/n;
  System.out.println("The average of the array is: " + average);
 } 
}
