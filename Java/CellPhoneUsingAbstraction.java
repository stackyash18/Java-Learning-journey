abstract class Telephone {
  abstract void ring();

  abstract void lift();

  abstract void disconnect();
}

class Smartphone extends Telephone {
  void lift() {
    System.out.println("You are lifting your Telephone.");
  }

  void ring() {
    System.out.println("Ringing...");
  }

  void disconnect() {
    System.out.println("Disconnected...");
  }
}

public class CellPhoneUsingAbstraction {
  public void main(String args[]) {
    Telephone tele = new Smartphone();
    tele.ring();

  }
}
