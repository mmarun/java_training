package com.javaTutorials;

public interface DBHelper {
    void openDatabaseConnection();
    void closeDatabaseConnection();
    void executeDatabaseQuery();

    //Below functions are voilating single responsibility principle..
    //Because they are not related..
    /*
    void logErrorsInDb();
    void logErrorsToFile();
    void handleErrors();

     */
}
