package multithreading.challenges.challenge1;

public class TwoThreads {
  public static void main(String args[])
  {
    FirstThread first = new FirstThread();

    SecondThread second = new SecondThread();

    for(int i=0; i<10; i++)
    {
      first.start();;
      second.start(); 
    }
  }
}
