public class ConcatenateArrayOfWords {
  public static void main(String args[])
  {
    String arr[] = {"Yash"," Yashika", " Deepanshu", " Deepanshi", " Mahima"};

    StringBuilder sb = new StringBuilder(arr[0]);

    for(int i = 1; i<arr.length; i++)
    {
     sb.append(arr[i]);
    }
    System.out.println(sb);
  }
}
