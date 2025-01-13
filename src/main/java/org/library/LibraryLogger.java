package org.library;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LibraryLogger {
  private static final Logger logger = LogManager.getLogger(LibraryLogger.class);

  public static void logEvent(String event) {
    logger.info(event);
  }

  public static void logError(String error) {
    logger.error(error);
  }
}
