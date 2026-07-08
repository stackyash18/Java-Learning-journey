class MyThread18 extends Thread {
  public void run() {
    while (true) {
      System.out.println("Running...");
      System.out.println("Thank you...");
    }
  }
}

public class ThreadMethod {
  public static void main(String args[]) {
    MyThread18 t1 = new MyThread18();
    MyThread18 t2 = new MyThread18();
    t1.start();
    try {
      t1.join();
    } catch (Exception e) {
      System.out.println(e);
    }

    t2.start();

  }
}
