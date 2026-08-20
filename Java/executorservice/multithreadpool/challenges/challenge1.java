package executorservice.multithreadpool.challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class challenge1 {
  public static void main(String args[]) throws InterruptedException
  {
    ExecutorService service = Executors.newFixedThreadPool(2);
   
    for(int i=0; i<10; i++)
    {
      Task task = new Task();
      service.submit(task);
    }

    if(!service.awaitTermination(10, TimeUnit.SECONDS))
    {
      service.shutdownNow();
      System.out.println("Emergency shutdown");
    }
    
  }
}
