import java.util.Scanner;

public class CellPhoneClass {

  static class CellPhone {
    public void ringing() {
      System.out.println("Ringing...");
    }

    public void vibrating() {
      System.out.println("Vibrating...");
    }
  }

  public static void main(String[] args) {
    CellPhone oneplus = new CellPhone();

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1 to Ring and 2 to Vibrate: ");
    int choice = sc.nextInt();

    if (choice == 1) {
      oneplus.ringing();
    } else if (choice == 2) {
      oneplus.vibrating();
    } else {
      System.out.println("Enter a valid choice (1 or 2)");
    }

    sc.close();
  }
}
