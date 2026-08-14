import java.util.Arrays;
import java.util.List;

public class SwapElementsUsingSetInterface {
  public static void main(String args[])
  {
    List<Integer> list = Arrays.asList(145,142,625,632,478,586,4527,8856);
    System.out.println(list);
    swap(list, 3, 5);
    System.out.println(list);


  }

  public static void swap(List<Integer> list, int x, int y)
  {
    int swap = list.get(x);
    list.set(x, list.get(y));
    list.set(y, swap);
  }
}
