package executorservice.singlethread.challenges;

public class Task implements Runnable {

  private final int num;

  public Task(int num)
  {
    this.num = num;
  }
  @Override
  public void run()
  {
    for(int i=1; i<=num; i++)
    {
      System.out.println(i);
    }
  }
}
