package executorservice.futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
  public static <T> void main(String args[]) throws InterruptedException, ExecutionException
  {
    ExecutorService service = Executors.newFixedThreadPool(1);
    FetchName task1 = new FetchName("Yash");
    FetchName task2 = new FetchName("vidush");
    FetchName task3 = new FetchName("arjun");
    FetchName task4 = new FetchName("lakshay");

    Future<String> name1 = service.submit(task1);
    Future<String> name2 = service.submit(task2);
    Future<String> name3 = service.submit(task3);
    Future<String> name4 = service.submit(task4); 

    System.out.println(name1.get());
    System.out.println(name2.get());
    System.out.println(name3.get());
    System.out.println(name4.get());

    service.shutdown();

  }
  
}
