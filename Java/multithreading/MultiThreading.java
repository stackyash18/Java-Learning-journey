package multithreading;
public class MultiThreading {
  public static void main(String args[]) {

    long startTime = System.currentTimeMillis();

    FirstTask t1 = new FirstTask();
    SecondTask t2 = new SecondTask();
    ThirdTask t3 = new ThirdTask();
    FourthTask t4 = new FourthTask();

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    long endTime = System.currentTimeMillis();

    System.out.printf("  time taken: %d", endTime-startTime);
  }
}
