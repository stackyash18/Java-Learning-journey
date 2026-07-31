package bank;

public class Customer {
  public static void main(String args[])
  {
    BankAccount account = new BankAccount("225453222", "Yash Tomar");
    account.depositMoney(1000);
    account.withdrawMoney(2000);
    account.showBalance();
  }
}
