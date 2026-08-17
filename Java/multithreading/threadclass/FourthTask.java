package multithreading.threadclass;

public class FourthTask extends Thread{
  @Override
  public void run()
  {
    for (int i = 1; i <= 1000; i++) {
      System.out.print(i + "#");
    }
    System.out.println();
    System.out.println("Fourth task done.");
  }
}
