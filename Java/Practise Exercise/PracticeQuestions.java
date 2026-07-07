class Cylinder
 {
  private double radius;
  private double height;
  private double surfaceArea;
  private double volume;

  public double getRadius()
  {
   return radius;
  }

  public void setRadius(double r)
  {
    radius = r;
  }

  public double getHeight()
  {
    return height;
  }
  public void setHeight(double h)
  {
    height = h;
  }
  public double getSurfaceArea()
  {
    surfaceArea = 2 * Math.PI * radius * (radius + height);
    return surfaceArea;
  }

 public double getVolume()
 {
  volume = Math.PI * radius * radius * height;
  return volume;
 }
    
}

 class Rectangle 
 {
  private double length;
  private double width;

  public Rectangle()
  {
    this.length = 4;
    this.width = 5;
  }

  public Rectangle(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  public double getLength()
  {
    return length;
  }
  public double getWidth()
  {
    return width;
  }

 }
public class PracticeQuestions {
  public static void main(String[] args) {
   Cylinder cyl = new Cylinder();

    cyl.setRadius(5);
    cyl.setHeight(10);
    System.out.println("Radius: " + cyl.getRadius());
    System.out.println("Height: " + cyl.getHeight());

    System.out.println("Surface Area: " + cyl.getSurfaceArea());
    System.out.println("Volume: " + cyl.getVolume());



    Rectangle rect1 = new Rectangle();
    System.out.println(rect1.getLength());
    System.out.println(rect1.getWidth());

  }
}
