public class CelcuisToFahrenheit {
  static double convertToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static void main(String[] args) {
    double celsius = 30;
    double fahrenheit = convertToFahrenheit(celsius);
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
  }
}