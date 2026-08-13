import java.util.HashSet;
import java.util.Set;

public class SetInterface {
  public static void main(String args[])
  {
    Set<String> set = new HashSet<String>();

    // Methods in set interface

    //1. Adding element in set using add method
    set.add("Orange");

    set.add("Apple");
    set.add("Mango");

    boolean isAdded = set.add("Pine Apple");

    System.out.println("The element is added in the set: " + isAdded);

    System.out.println(set);

    System.out.println(set.size());
  }
}
