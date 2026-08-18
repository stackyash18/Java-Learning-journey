package multithreading.challenges.challenge1;

public class SecondThread extends Thread{
  @Override
  public void run()
  {
    System.out.println("Hello from thread 2");
  }
}
