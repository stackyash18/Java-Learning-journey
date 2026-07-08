import java.util.Scanner;

public class SquareClass {
  static class Square {
    int side;

    public int area() {
      return side * side;
    }

    public int perimeter() {
      return 4 * side;
    }

  }

  public static void main(String[] args) {
    Square Sq1 = new Square();
    System.out.print("Enter the length of the side of square: ");
    Scanner sc = new Scanner(System.in);
    Sq1.side = sc.nextInt();
    System.out.println("Area of square: " + Sq1.area());
    System.out.println("Perimeter of Square: " + Sq1.perimeter());

    sc.close();

  }
}
