import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAList
{
  public static void main(String args[])
  {
    List<Integer> list = Arrays.asList(45,52,63,78,12,74,85,44);
    System.out.println(list);
    reverse(list);
    System.out.println(list);
  }

  public static void reverse(List<Integer> list)
  {
    Collections.reverse(list);
  }
}