public class SuperKeyword
{
  static class Employee
  {
    void login() 
    {
      System.out.println("Employee login successfully..");
    }
  }

  static class Admin extends Employee
  {
    @Override
    void login()
    {
      System.out.println("Admin login successfully..");
    }
     
    void testAdmin()
    {
      login();
      super.login();
    }
  }

  public static void main(String args[])
  {
    Admin ad = new Admin();
    ad.testAdmin();
  }
}
