import java.util.Scanner;

public class CircleClass {
  static class Circle {
    int radius;

    public double area() {
      return 3.14 * radius * radius;
    }

    public double circumference() {
      return 2 * 3.14 * radius;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Circle circ1 = new Circle();
    System.out.print("Enter the radius of the Circle: ");
    circ1.radius = sc.nextInt();
    System.out.println("Area of Circle: " + circ1.area());
    System.out.println("Circumference of Circle: " + circ1.circumference());

    sc.close();
  }
}
