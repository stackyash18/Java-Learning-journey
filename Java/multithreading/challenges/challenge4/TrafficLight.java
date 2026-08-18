package multithreading.challenges.challenge4;


public class TrafficLight extends Thread{
  private final TrafficColor color;

  public TrafficLight(TrafficColor color)
  {
    this.color = color;
  }

  @Override
  public void run()
  {
    System.out.println();
    System.out.printf("%s active", color);
    try {
      Thread.sleep(color.getOnTimeInMills());
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println();
    System.out.printf("%s  Inactive\n", color);
  }

}
