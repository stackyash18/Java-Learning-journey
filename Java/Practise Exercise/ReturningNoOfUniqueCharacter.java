import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReturningNoOfUniqueCharacter {
  public static void main(String args[])
  {
    Set<Character> unique = new HashSet<>();
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter Your String: ");
    String userStr = input.nextLine();

    for( char ch : userStr.toCharArray())
    {
      unique .add(ch);
    }

    System.out.println("Your string has " + unique.size() + " unique characters.");
  }
}
