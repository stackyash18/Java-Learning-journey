package vehicle;

public class Main {

  static class Vehicle {
    public void service() {
      System.out.println("The vehicle has been serviced.");
    }

  }

  static class Car extends Vehicle {
    @Override
    public void service() {
      System.out.println("The car service has beem done.");
      super.service();
    }
  }

  public static void main(String args[]) {
    Vehicle veh = new Vehicle();
    veh.service();

    Car car = new Car();
    car.service();

  }
}
