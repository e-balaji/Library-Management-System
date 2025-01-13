package org.library;

import java.util.List;

public class Patron {
  private String name;
  private String id;
  private List<Book> borrowedBooks;

  // Constructor, getters, setters
  public Patron(String name, String id) {
    this.name = name;
    this.id = id;
    this.borrowedBooks = new java.util.ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setBorrowedBooks(java.util.List<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  public void borrowBook(Book book) {
    borrowedBooks.add(book);
  }

  public void returnBook(Book book) {
    borrowedBooks.remove(book);
  }

  public List<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  @Override
  public String toString() {
    return "Patron{" +
        "name='" + name + '\'' +
        ", id='" + id + '\'' +
        ", borrowedBooks=" + borrowedBooks +
        '}';
  }
}
