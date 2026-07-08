class MyThread extends Thread {
  public MyThread(String name) {
    super(name);
  }

  public void run() {
    for (int i = 1; i <= 1000; i++) {
      System.out.println("Running: " + Thread.currentThread().getName());
    }
  }
}

public class ThreadPriorities {
  public static void main(String args[]) {
    MyThread t1 = new MyThread("Cursor blinking task(most important)");
    MyThread t2 = new MyThread("Compiling the program file(less priority)");

    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);

    t1.start();
    t2.start();
    Thread.activeCount();

  }
}