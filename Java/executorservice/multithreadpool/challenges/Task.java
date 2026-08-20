package executorservice.multithreadpool.challenges;

public class Task implements Runnable {
  @Override
  public void run()
  {
    Thread current = Thread.currentThread();
    System.out.printf("\nStarted Thread: %s \n", current.getName());
    try {
      Thread.sleep(getRandom()*1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.printf("\nEnded thread is: %s \n", current.getName());

  }
   private int getRandom()
   {
    double random = Math.random() * 5 + 1;
    return (int) random;
   } 
}
