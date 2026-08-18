package multithreading.challenges.challenge4;

public class Main {
  public static void main(String args[]) throws InterruptedException
  {
    TrafficLight t1 = new TrafficLight("Green");
    TrafficLight t2 = new TrafficLight("Yellow");
    TrafficLight t3 = new TrafficLight("Red");

    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
  }
}
