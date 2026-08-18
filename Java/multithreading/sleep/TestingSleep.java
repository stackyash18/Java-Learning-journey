package multithreading.sleep;

public class TestingSleep {
  public static void main(String args[]) throws InterruptedException
  {
    System.out.println("Before thread sleeping");
    Thread.sleep(1000);
    System.out.println("Thread woke up after 1000. milisecond");
  }
}
