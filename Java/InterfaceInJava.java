interface Bicycle {
  void applyBrakes(int decreement);

  void speedUp(int increement);
}

interface HornBicycle {
  void blowHornK3g();

  void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
  int speed = 7;

  void blowHorn() {
    System.out.println("Pee Pee Poo Poo");
  }

  public void applyBrakes(int decrement) {
    speed = speed - decrement;
    System.out.println("Speed after Applying Brakes: " + speed);
  }

  public void speedUp(int increment) {
    speed = speed + increment;
    System.out.println("Speed after Speeding up: " + speed);
  }

  public void blowHornK3g() {
    System.out.println("Kabhi Khushi Kabhi Gum pee pee pee pee");
  }

  public void blowHornmhn() {
    System.out.println("Main hoon naa po po po po");
  }
}

public class InterfaceInJava {
  public static void main(String args[]) {
    AvonCycle cycle = new AvonCycle();

    cycle.applyBrakes(5);
    cycle.speedUp(7);
    cycle.blowHornK3g();
    cycle.blowHornmhn();
  }
}
