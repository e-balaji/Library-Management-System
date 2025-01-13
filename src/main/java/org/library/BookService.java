package org.library;

import java.util.*;


public class BookService {
  private Map<String, Book> books;

  public BookService() {
    this.books = new HashMap<>();
  }

  public void addBook(Book book) {
    books.put(book.getIsbn(), book);
  }

  public void removeBook(String isbn) {
    books.remove(isbn);
  }

  public Book searchBook(String isbn) {
    return books.get(isbn);
  }

  public List<Book> searchBooksByTitle(String title) {
    List<Book> results = new ArrayList<>();
    for (Book book : books.values()) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        results.add(book);
      }
    }
    return results;
  }

  public List<Book> searchBooksByAuthor(String author) {
    List<Book> results = new ArrayList<>();
    for (Book book : books.values()) {
      if (book.getAuthor().equalsIgnoreCase(author)) {
        results.add(book);
      }
    }
    return results;
  }
}
