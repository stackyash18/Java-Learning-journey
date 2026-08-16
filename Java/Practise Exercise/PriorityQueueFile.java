import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueFile {

  public static void main(String args[])
  {
    PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
      @Override
      public int compare(Student student, Student t1)
      {
        return student.getGrade() - t1.getGrade();
      }
    });

    queue.offer(new Student("Yash Tomar", 'A'));
    queue.offer(new Student("Vansh", 'B'));
    queue.offer(new Student("Yess", 'C'));
    queue.offer(new Student("Yash Tomar", 'D'));

    System.out.println("Queue is: " + queue);
  }
  private static class Student
  {
    private final String name;
     private char grade;

     public Student(String name, char grade)
     {
      this.name = name;
      this.grade = grade;
     }
     

     public char getGrade() {
      return grade;
     }
     
     @Override
     public String toString()
     {
      return name + ": " + grade;
     }


  }
}
