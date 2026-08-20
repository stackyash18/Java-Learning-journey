package executorservice.singlethread.challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class challenge1 {
  public static void main(String args[])
  {
    ExecutorService service = Executors.newSingleThreadExecutor();
    Task task = new Task(10);

    service.submit(task);
  }
}
