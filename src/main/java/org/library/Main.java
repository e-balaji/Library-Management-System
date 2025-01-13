package org.library;

public class Main {

  public static void main(String[] args) {

    PatronService patronService=new PatronService();
    patronService.addPatron(new Patron("John","1"));
    BookService bookService = new BookService();
    bookService.addBook(new Book("1","Java","PB12321",2001));
  }

}