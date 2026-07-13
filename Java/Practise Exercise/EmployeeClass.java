public class EmployeeClass {
  static class Employee {
    String name;
    int id;
    int salary;

    public int getSalary() {
      return salary;
    }

    public String getName() {
      return name;
    }

    public void setName(String n) {
      name = n;

    }
  }

  public static void main(String[] args) {

    Employee Yash = new Employee();
    Yash.setName("Yash Tomar");
    Yash.salary = 50000;
    System.out.println("Employee Name: " + Yash.getName());
    System.out.println("Employee Salary: " + Yash.getSalary());
  }
}