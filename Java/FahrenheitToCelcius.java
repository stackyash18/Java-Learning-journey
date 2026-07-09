public class FahrenheitToCelcius {
   public static double convertToCelcius(double fahrenheit)
  {
    return((fahrenheit-32)*(5/9));
  }
  public static void main(String args[])
  {
   double fahrenheit = 85.24;
   double celcius = convertToCelcius(fahrenheit);
   System.out.println("The temperature in celcius is: " + celcius);
  }
}
