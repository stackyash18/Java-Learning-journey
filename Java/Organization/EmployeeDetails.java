package organization;

public class EmployeeDetails {
  public static void main(String args[]) {
    Employee emp = new Employee("Yash Tomar", 20, 25000);
    System.out.println(emp.getEmployeeDetails());
    emp.setName("Yash");
    System.out.println(emp.getEmployeeDetails());
  }
}
