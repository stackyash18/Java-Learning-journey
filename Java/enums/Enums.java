package enums;
public class Enums {
  public static void main(String args[])
  {
     TrafficLight color = TrafficLight.RED; 
     System.out.println(color);
     
     System.out.println("Printing all the days of the week.");
     
     for(Days value : Days.values())
     {
      System.out.printf("%s : %s\n", value, value.getType());
     }
  }
}
