public class MethodOverloading {
  static void yash() {
    System.out.println("Hello Everyone, this is Yash");
  }

  static void yash(int a) {
    System.out.println("Hello Everyone, this is Yash " + a);
  }

  public static void main(String[] args) {
    System.out.println("Method Overloading in Java");
    System.out.print("The value for the method yash() is:  ");
    yash();

    System.out.println("The value for the method yash(int a) is:  ");
    yash(20);
  }
}
