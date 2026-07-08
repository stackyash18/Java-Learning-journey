
import java.util.Scanner;

public class percentCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("CBSE Board Percent Calculator");

    System.out.println("Enter the total marks");
    float totalMarks = input.nextFloat();

    System.out.println("Enter Physics marks");
    int physicsMarks = input.nextInt();

    System.out.println("Enter Chemistry marks");
    int chemistryMarks = input.nextInt();

    System.out.println("Enter Maths marks");
    int mathsMarks = input.nextInt();

    System.out.println("Enter English marks");
    int englishMarks = input.nextInt();

    System.out.println("Enter Computer Science marks");
    int computerScienceMarks = input.nextInt();

    int obtainedMarks = physicsMarks + chemistryMarks + mathsMarks + englishMarks + computerScienceMarks;

    float percentage = (obtainedMarks / totalMarks) * 100;
    System.out.println("Your percentage is: " + percentage + "%");

    input.close();
  }
}