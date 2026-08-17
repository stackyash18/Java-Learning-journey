package multithreading;
public class FirstTask extends Thread {
  @Override
  public void run()
  {
    for (int i = 1; i <= 1000; i++) {
      System.out.println();
      System.out.print(i + "*");
    }

    System.out.println();
    System.out.println("First task done.");
  }
}
