import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
  public static void main(String args[])
  {
    Queue<Integer> queue = new LinkedList<>();

    //Methods in queue

    //1. Adding element in queue using add or offer method
    queue.add(105);
    queue.add(1045);

    //2. Removing element in queue using remove or poll method
    queue.remove(1045);

    //3. Retrieves element using 
    System.out.println(queue.peek());

    System.out.println(queue);

    queue.poll();
    System.out.println("The collection is" + queue);
  }
}
