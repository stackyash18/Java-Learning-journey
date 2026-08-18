package multithreading.challenges.challenge1;

public class SecondThread extends Thread{
  @Override
  public void run()
  {
      for (int i = 0; i < 10; i++) {   
        System.out.println( (i+1) + " Hello from thread 2");
      }
  }
}
