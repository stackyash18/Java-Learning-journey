package multithreading;

public class ThirdTask extends Thread {
  @Override
  public void run()
  {
    for (int i = 1; i <= 1000; i++) {
      System.out.println();
      System.out.print(i + "$");
    }
    System.out.println();
    System.out.println("Third task done.");
  }
}
