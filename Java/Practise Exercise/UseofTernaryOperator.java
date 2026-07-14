import java.util.Scanner;

public class UseofTernaryOperator {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the marks for a grade: ");
    int num = input.nextInt();
    String grade = score(num);
    System.out.println(grade);

  }
  public static String score(int num)
  {
    String grade = (num<50)?"Low marks."
                  :(num>=50&&num<80)?"Moderate Marks."
                  :"High marks.";
   return grade;
  }
}
