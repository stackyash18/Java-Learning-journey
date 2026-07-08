interface Animal {
  void sleep();

  void eat();
}

class Monkey {
  void bite() {
    System.out.println("Monkey is Biting...");
  }

  void jump() {
    System.out.println("Monkey is Jumping...");
  }
}

class HumanBasic extends Monkey implements Animal {
  void bite() {
    System.out.println("Human is Biting.");
  }

  void jump() {
    System.out.println("Human is Jumping.");
  }

  public void sleep() {
    System.out.println("Human is Sleeping.");
  }

  public void eat() {
    System.out.println("Human is Eating.");
  }

}

public class AnimalAbstractClass {
  public static void main(String args[]) {
    HumanBasic human = new HumanBasic();
    human.sleep();

    Monkey hum = new HumanBasic();
    hum.bite();

    Animal yash = new HumanBasic();
    yash.eat();
  }
}
