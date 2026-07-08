class MyCollegeData {
  private int id;
  private String name;

  public MyCollegeData() {
    id = 14;
    name = "Yash Tomar";
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    this.name = n;
  }

  public void setId(int i) {
    this.id = i;
  }

  public int getId() {
    return id;
  }
}

public class Contructors {
  public static void main(String[] args) {
    MyCollegeData Yash = new MyCollegeData();
    // Yash.setName("Yash TOmar");
    // Yash.setId(3291);
    System.out.println(Yash.getId());
    System.out.println(Yash.getName());
  }
}
