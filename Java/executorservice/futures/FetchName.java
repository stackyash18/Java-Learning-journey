package executorservice.futures;

import java.util.concurrent.Callable;

/**
 * Callable
 */
public class FetchName implements Callable<String> {

  private final String name;

  public FetchName(String name)
  {
    this.name = name;
  }

  @Override
  public String call() throws Exception
  {
    System.out.printf("\nGetting name of %s from server\n", name);
    Thread.sleep(4000);
    return name + " Bhartiya";
  }

}
