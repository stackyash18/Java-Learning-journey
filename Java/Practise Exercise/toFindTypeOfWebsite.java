import java.util.Scanner;

public class toFindTypeOfWebsite {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the Website URL: ");
    String url = input.nextLine();

    if (url.endsWith(".com")) {
      System.out.println("This is a Commercial Website.");
    } else if (url.endsWith(".org")) {
      System.out.println("This is an Organizational Website.");
    } else if (url.endsWith(".edu")) {
      System.out.println("This is an Educational Website.");
    } else if (url.endsWith(".in")) {
      System.out.println("This is an Indian website.");
    } else if (url.endsWith(".gov")) {
      System.out.println("This is a Government Website.");
    }

    input.close();
  }
}
