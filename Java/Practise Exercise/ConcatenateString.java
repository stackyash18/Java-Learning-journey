public class ConcatenateString {

  public static void main(String args[])
  {
    String ab = concatenate("Yash", "Tomar", "Second Year");
    System.out.println(ab);
  }
  public static String concatenate(String... strs)
  {
    StringBuilder sb = new StringBuilder();
    for(String str : strs)
    {
      sb.append(str).append(" ");
    }
    return sb.toString();
  }
}
