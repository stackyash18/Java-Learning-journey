class Parent {
  Parent() {
    System.out.println("I'm the parent constructor.");
  }

  Parent(int x) {
    System.out.println("I'm the parent constructor with parameter: " + x);
  }
}

class child extends Parent {
  child() {

    super(10);
    System.out.println("I'm the child constructor.");
  }

  child(int x) {
    super(x);
    System.out.println("I'm the child constructor with parameter: " + x);
  }
}

class GrandChild extends child {
  GrandChild() {
    super(20);
    System.out.println("I'm the grandchild constructor.");
  }

  GrandChild(int x) {
    super(x);
    System.out.println("I'm the grandchild constructor with parameter: " + x);
  }
}

public class ConstructorsInInheritance {
  public static void main(String[] args) {
    GrandChild gc = new GrandChild();
    GrandChild gc1 = new GrandChild(30);

    gc.getClass();
    gc1.getClass();

  }
}
