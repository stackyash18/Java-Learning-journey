
public class LibrarySystem {

  public class Book
  {
    String title;
    String author;
    long isbn;
    public static int totalBooks = 1000;

    public void borrowBook()
    {
      System.out.println("The book has been borrowed.");
      totalBooks--;
    }

    public void returnBook()
    {
      System.out.println("The book has been returned.");
      totalBooks++;
    }

    public static int getTotalBooks()
    {
      return totalBooks;
    }
  }
  public static void main(String args[])
  {


  }
}
