import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToCountTheFrequencyOfAnElement {
  public static void main(String args[])
  {
    List<Integer> list = Arrays.asList(414,142,2,21,451,216,441,441,441,441,441);

    System.out.println(Collections.frequency(list, 441));
  }
}
