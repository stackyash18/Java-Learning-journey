interface MyCamera {
  void takeSnap();

  void recordVideo();
}

interface MyWifi {
  String[] getNetworks();

  void connectToNetwork(String networks);
}

class MyCellPhone {
  void callNumber(long phoneNumber) {
    System.out.println("Calling " + phoneNumber);
  }

  void pickCall() {
    System.out.println("Connecting...");
  }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
  public void takeSnap() {
    System.out.println("Taking Snap");
  }

  public void recordVideo() {
    System.out.println("Recording Video");
  }

  public String[] getNetworks() {
    System.out.println("Getting List of Networks");
    String[] networkList = { "Harry", "Arjun", "Yash", "Karn" };
    return networkList;
  }

  public void connectToNetwork(String network) {
    System.out.println("Connecting to " + network);
  }
}

public class SmartPhoneInterface {
  public static void main(String args[]) {
    MySmartPhone nokia = new MySmartPhone();
    String[] ar = nokia.getNetworks();
    for (String item : ar) {
      System.out.println(item);
    }
    nokia.callNumber(827340924);
    nokia.takeSnap();
    nokia.recordVideo();
  }
}