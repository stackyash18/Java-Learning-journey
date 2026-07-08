class Library {
  String[] books;
  int no_of_books;

  Library() {
    this.books = new String[100];
    this.no_of_books = 0;
  }

  void addBooks(String book) {
    this.books[no_of_books++] = book;
    System.out.println(book + " has been added.");
  }

  void showAvailableBooks() {
    System.out.println("Available Books in your Library are as follows: ");
    for (String book : this.books) {
      if (book == null) {
        continue;
      }
      System.out.println("*" + book);
    }
  }

  void issueBooks(String book) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].equals(book)) {
        System.out.println("The book has been Issued.");
        this.books[i] = null;
        return;
      }
    }
    System.out.println("This Book Does not exist");
  }

  void returnBooks(String book) {
    addBooks(book);
  }
}

public class OnlineLibrary {
  public static void main(String args[]) {
    Library PublicLib = new Library();
    PublicLib.addBooks("Atomic Habbits");
    PublicLib.addBooks("Ikigai");
    PublicLib.addBooks("Rich Dad Poor Dad");
    PublicLib.showAvailableBooks();
    PublicLib.issueBooks("Atomic Habbits");
    PublicLib.showAvailableBooks();

  }
}