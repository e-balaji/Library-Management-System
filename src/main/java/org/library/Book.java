package org.library;

public class Book {
  private String title;
  private String author;
  private String isbn;
  private int publicationYear;
  private boolean isAvailable;
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }



  // Constructor, getters, setters, toString
  public Book(String title, String author, String isbn, int publicationYear) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.publicationYear = publicationYear;
    this.isAvailable = true;
  }
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", isbn='" + isbn + '\'' +
        ", publicationYear=" + publicationYear +
        ", isAvailable=" + isAvailable +
        '}';
  }
}
