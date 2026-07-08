class Phone {
  public void showTime() {
    System.out.println("Time is 2.30");
  }

  public void on() {
    System.out.println("Turning on the phone.");
  }
}

class SmartPhone extends Phone {
  public void music() {
    System.out.println("Playing music.");
  }
}

public class DynamicMethodDispatch {
  public static void main(String[] args) {

    Phone obj = new SmartPhone(); // Upcasting
    obj.showTime();
    obj.on(); // this symbolize the dynamic dispatch method
    // obj.music(); // This will give an error because the reference type is Phone,
    // which does not have the music() method.
  }
}
