package multithreading.challenges.challenge2;
public class Main
{
  public static void main(String args[]) throws InterruptedException
  {
    ThreadState t1 = new ThreadState();
    System.out.println();
    System.out.printf("Created the thread %s", t1.getState());
    System.out.println();

    t1.start();
    System.out.println();
    t1.join();
    System.out.println();
    System.out.printf("thread finished %s", t1.getState()); 
    System.out.println();
  }

}