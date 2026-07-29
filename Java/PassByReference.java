public class PassByReference {
  
  public static  class Point
  {
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "Point [x=" + x + ", y=" + y + "]";
    }

    
  }

  public static void move(Point first)
  {
    first.x++;
    first.y++;
  }
  public static void main(String args[])
  {
    Point first = new Point(25,45);
    System.out.println("First: " + first);
    move(first);
    System.out.println("First: " + first);
  }
} 
