package multithreading.threadclass;

public class Priority {
  public static void main(String args[]) {

    long startTime = System.currentTimeMillis();

    System.out.println("\nStarting First Thread");
    FirstTask t1 = new FirstTask();
    t1.setPriority(Thread.MIN_PRIORITY);
    System.out.println("\nStarting Second Thread");
    SecondTask t2 = new SecondTask();
    t2.setPriority(Thread.NORM_PRIORITY);
    System.out.println("\nStarting Third Thread");
    ThirdTask t3 = new ThirdTask();
    t3.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
    long endTime = System.currentTimeMillis();

    System.out.printf("                 %s  time taken: %d", Thread.currentThread().getName(), endTime-startTime);
  }
}
