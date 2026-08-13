import java.util.ArrayList;
import java.util.List;

public class ListInterface {
  public static void main(String args[])
  {
    List<Integer> list = new ArrayList<Integer>();
    //Methods  of list interface

    //1. add method
    list.add(40);
    list.add(70);
    list.add(50);
    list.add(80);
    
    //2. get method
    System.out.println(list.get(0));

    //3. adding at specific position
    list.add(2,45);

    //4. Removing element using remove method
    list.remove(4);

    //5. Checking a specific element using contain method
   if (list.contains(50))
   {
    System.out.println("50 exists");
   }
    
  }
}
