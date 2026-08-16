import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge {
  public static void main(String args[])
  {
    Map<String, String> map = new HashMap<>();
    map.put("India", "New Delhi");
    map.put("Nepal", "Kathamandu");
    map.put("Sri Lanka", "Colombo ");
    map.put("Bhutan", "Thimphu");
    map.put("United States Of America", "Washington, D.C");
    map.put("Russia", "Moscow ");
    map.put("Japan", "Tokyo");

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the country name: ");
    String country = input.nextLine();
    if(map.containsKey(country))
    {
      System.out.printf("Capital of %s is %s", country, map.get(country));
    } else
    {
      System.out.println("Sorry we dont know the capital.");
    }
  }
}
