package org.library;

import java.util.*;

public class PatronService {
  private Map<String, Patron> patrons;

  private LibraryLogger libraryLogger;

  public PatronService() {
    this.patrons = new HashMap<>();
  }

  public void addPatron(Patron patron) {
    patrons.put(patron.getId(), patron);
    libraryLogger.logEvent("Patron added: " + patron.getName());
  }

  public Patron getPatronById(String id) {
    return patrons.get(id);
  }

  public void updatePatron(Patron patron) {
    patrons.put(patron.getId(), patron);
  }
}

