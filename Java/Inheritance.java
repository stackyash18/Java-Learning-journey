class Base {
  int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    System.out.println("This is the base class");
    this.x = x;
  }

  public void printMe() {
    System.out.println("I am a constructor");
  }
}

class Derived extends Base {

  int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    System.out.println("This is the derived class");
    this.y = y;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Derived d = new Derived();
    d.setX(10);
    d.setY(20);
    System.out.println("The value of x is: " + d.getX());
    System.out.println("The value of y is: " + d.getY());
  }
}
