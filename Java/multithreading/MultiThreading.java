package multithreading;
public class MultiThreading {
  public static void main(String args[]) {

    long startTime = System.currentTimeMillis();

    System.out.println("\nStarting First Thread");
    FirstTask t1 = new FirstTask();
    System.out.println("\nStarting Second Thread");
    SecondTask t2 = new SecondTask();
    System.out.println("\nStarting Third Thread");
    ThirdTask t3 = new ThirdTask();

    t1.start();
    t2.start();
    t3.start();
    long endTime = System.currentTimeMillis();

    System.out.printf("  time taken: %d", endTime-startTime);
  }
}
