/* 
  Summary Table Link -  https://docs.google.com/document/d/1LYD1spDHk7oGvAsjbj8S6Zvh-HjYliO6htYxG6qqQEQ/edit?usp=sharing
*/
class MyRunnable implements Runnable {
  String name;

  MyRunnable(String name) {
    this.name = name;
  }

  public void run() {
    int j = 96;
    System.out.println(j);
    for (int i = 1; i <= 10; i++) {
      System.out.println("Thread Running: " + name);
    }
  }
}

public class ThreadConstructor {
  public static void main(String args[]) {
    MyRunnable obj = new MyRunnable("yash");
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj);
    t2.start();
    t1.start();
    System.out.println(t1.threadId());
    System.out.println("The thread id of t1 is: " + t2.threadId());
    System.out.println("The thread name of t2 is: " + t2.getName());
  }
}
