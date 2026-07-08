class Circle {
  public int radius;

  Circle() {
    System.out.println("I'm non param of Circle.");
  }

  Circle(int r) {
    System.out.println("I'm a Circle Paremeterized Constructor.");
    this.radius = r;
  }

  public double circleArea() {
    return Math.PI * this.radius * this.radius;
  }
}

class Cylinder extends Circle {
  public int height;

  Cylinder(int r, int h) {
    super(r);
    System.out.println("I'm a Cylinder Parameterized Constructor.");
    this.height = h;
  }

  public double cylinderVolume() {
    return Math.PI * this.radius * this.radius * this.height;
  }
}

public class CylinderFromCIrcleUsingInheritance {
  public static void main(String args[]) {
    Cylinder cyl = new Cylinder(5, 12);
    System.out.println("Volume of Cylinder: " + cyl.cylinderVolume());
    System.out.println("Area of Circle: " + cyl.circleArea());

  }
}
