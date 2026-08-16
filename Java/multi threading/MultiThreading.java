public class MultiThreading {
  public static void main(String args[]) {

    long startTime = System.currentTimeMillis();
    for (int i = 1; i <= 1000; i++) {
      System.out.print(i + "*");
    }

    System.out.println();
    System.out.println("First task done.");

    for (int i = 1; i <= 1000; i++) {
      System.out.print(i + "^");
    }
    System.out.println();
    System.out.println("Second task done.");

    for (int i = 1; i <= 1000; i++) {
      System.out.print(i + "$");
    }
    System.out.println();
    System.out.println("Third task done.");

    for (int i = 1; i <= 1000; i++) {
      System.out.print(i + "#");
    }
    System.out.println();
    System.out.println("Fourth task done.");

    long endTime = System.currentTimeMillis();

    System.out.printf("Total time taken: %d", endTime-startTime);
  }
}
