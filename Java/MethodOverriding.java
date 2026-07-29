public class MethodOverriding {
 static class Employee
  {
    void employees()
    {
      System.out.println("These Employees belongs to the organization.");
    }
  }

 static class TechDepartment extends Employee
  {
    @Override
    void employees()
    {
      System.out.println("These Employees are of tech department.");
    }
  }

  public static void main(String args[])
  {
    Employee emp = new Employee();
    emp.employees();

    TechDepartment techEmp = new TechDepartment();
    techEmp.employees();

  }
}
