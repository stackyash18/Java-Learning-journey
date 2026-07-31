package bank;
class BankAccount {
  private String accountNumber;
  private String accountHolderName;
  private double balance;

  

  public BankAccount(String accountNumber, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
  }

  public void depositMoney(double money)
  {
    if(money<=0)
    {
      System.out.println("Invalid deposit.");
    }
    else
    {
      balance += money;
      System.out.println("Money has been deposited successfully in your account.");
    }
  }

  public double withdrawMoney(double money)
  {
    if(money<=0)
    {
      System.out.println("Invalid withdrawal.");
    } else
    if(money>balance)
    {
      System.out.println("Insuficient Balance.");
    } else 
    {
      balance -= money;
      System.out.printf("$%f  has been withdrawal succesfully.",money);
    }
    return money;
  }

  public void showBalance()
  {
    System.out.printf("The balance in your account is: $%f",balance);
  }


  public static void main(String args[])
  {
    
  }
}
