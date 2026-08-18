package multithreading.challenges.challenge4;


public class TrafficLight extends Thread{
  private final String status;

  public TrafficLight(String status)
  {
    this.status = status;
  }

  @Override
  public void run()
  {
    System.out.printf("%s Thread Starting-%d\n",
                      Thread.currentThread().getName()
                      , status);

                      try {
                        Thread.sleep(5000);
                      } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                      }
    System.out.printf("%s Thread Ended-%d\n",
                      Thread.currentThread().getName()
                      , status);
  }
}
