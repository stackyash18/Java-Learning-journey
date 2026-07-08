class EmployeeSalary {
  private int salary;

  public EmployeeSalary() {
    salary = 20000;
  }

  public EmployeeSalary(int s) {
    salary = s;
  }

  void display() {
    System.out.println("Salary: " + salary);
  }
}

public class ConstructorsOverloading {
  public static void main(String[] args) {
    EmployeeSalary Yash = new EmployeeSalary(1000000);
    EmployeeSalary Yashika = new EmployeeSalary(2000000);

    Yash.display();
    Yashika.display();
  }
}
