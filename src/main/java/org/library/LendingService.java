package org.library;

import java.util.*;

public class LendingService {
  private BookService bookService;
  private PatronService patronService;

  private LibraryLogger libraryLogger;

  public LendingService(BookService bookService, PatronService patronService) {
    this.bookService = bookService;
    this.patronService = patronService;
  }

  public boolean checkoutBook(String patronId, String bookIsbn) {
    Patron patron = patronService.getPatronById(patronId);
    Book book = bookService.searchBook(bookIsbn);

    if (book != null && book.isAvailable()) {
      book.setAvailable(false);
      patron.borrowBook(book);
      return true;
    }
    return false;
  }

  public void returnBook(String patronId, String bookIsbn) {
    Patron patron = patronService.getPatronById(patronId);
    Book book = bookService.searchBook(bookIsbn);

    if (book != null) {
      patron.returnBook(book);
      book.setAvailable(true);
      libraryLogger.logEvent("Book returned by " + patron.getName());
    }
  }
}

