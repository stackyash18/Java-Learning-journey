package Fly;

public class Eagle  extends Bird{

  public Eagle(String breed)
  {
    super(breed);
  }
  @Override 
  public void fly()
  {
    System.out.println("Eagle is flying.");
  }
  
}
