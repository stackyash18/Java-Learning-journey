package Shape;

public class TestShape {
  public static void main(String args[])
  {
    Circle circ = new Circle(52.12);
    Square sq = new Square(10.25);

    System.out.println("Area of a Circle is: " + circ.calculateArea());
    System.out.println("Area of a Square is: " + sq.calculateArea());
  }
}
