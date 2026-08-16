import java.util.HashMap;
import java.util.Map;

public class MapInterface {
  public static void main(String args[])
  {
    Map<String, Integer> map = new HashMap<>();
    map.put("Oranges", 99);
    map.put("Mango", 99);
    map.put("Apple", 99);
    map.put("Strawberry", 99);
    map.put("Bananas", 99);
    map.put("Watermelon", 99);
    map.put("Sunflower Seeds", 99);

    System.out.println(map.size());
    System.out.println(map.get("Mango"));
    System.out.println(map.keySet());

  }
}
