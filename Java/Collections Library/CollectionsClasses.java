import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClasses {
  public static void main(String args[])
  {
    List<Integer> num = new ArrayList<>();

    num.add(104);
    num.add(-451);
    num.add(45);
    num.add(15);
    num.add(6441);
    num.add(6786);

    Collections.sort(num);

    System.out.println(num);
  }
}
