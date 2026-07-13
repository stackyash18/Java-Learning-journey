  public class Book
  {
    public static int totalBooks;
    String title;
    String author;
    long isbn;
    boolean isBorrowed;

    static
    {
      totalBooks = 0;
    }
    {
      totalBooks++;
    }

    Book(long isbn, String title, String author)
    {
      this.isbn = isbn;
      this.title = title;
      this.author = author;
    }

    Book(long isbn)
    {
      this(isbn,"unknown","unknown");
    }

    public static int getTotalBooks()
    {
      return totalBooks;
    }

    public void borrowBook()
    {
      if(isBorrowed)
      {
        System.out.println("Book is already borrowed");
      }
      else
      {
        this.isBorrowed = true;
        System.out.println("The book has been borrowed.");
        totalBooks--;
      }
    }

    public void returnBook()
    {
      if(isBorrowed)
      {
        this.isBorrowed = false;
        System.out.println("The book has been returned.");
        totalBooks++;
      }
      else
      {
        System.out.println("This book is already in the library.");
      }
    }

 
  public static void main(String args[])
  {
    
    Book missleManOfindia = new Book(1254,"Missile Man Of India","APJ Abdul Kalam");
    Book theGreatestShowOnEarth = new Book(1346);
    System.out.println(Book.totalBooks);
    missleManOfindia.borrowBook();
    theGreatestShowOnEarth.borrowBook();
    missleManOfindia.borrowBook();
    theGreatestShowOnEarth.returnBook();
    theGreatestShowOnEarth.returnBook();
  }
}

