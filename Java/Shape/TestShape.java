package Shape;

public class TestShape {
  public static void main(String args[])
  {
    Circle circ = new Circle(52.12);
    Square sq = new Square(10.25);

    System.out.printf("Area of a Circle is: %5.2f", circ.calculateArea());
    System.out.println();
    System.out.printf("Area of a Square is: %5.2f", sq.calculateArea());
  }
}
