public class CollegeManangement {

  class Course
  {
    String courseName;
    int enrolledStudents;

    public static int maxCapicity;

    public void enrollStudent(String studentName)
    {
      System.out.println(studentName + " Has been enrolled in the course " + courseName);
      maxCapicity--;
    }

    public void unenrollStudent(String studentName)
    {
      System.out.println(studentName + " Has been unenrolled from the course " + courseName);
      maxCapicity++;
    }

    public static int setMaxCapicity(int capacity)
    {
      return capacity;
    }
  }
  public static void main(String args[])
  {
    

  }
}
