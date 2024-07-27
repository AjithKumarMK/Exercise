/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Ajith18
 */
public class NewClass {
    // Volatile keyword ensures visibility of changes to variables across threads
    private static volatile NewClass  instance;

    private NewClass () {
        // Private constructor to prevent instantiation
    }

    public static NewClass  getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (NewClass .class) {
                if (instance == null) { // Second check (with locking)
                    instance = new NewClass ();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        // In a real-world application, you would write this message to a log file
        System.out.println(message);
    }
}

// Usage
public class  NewClass {
    public static void main(String[] args) {
        NewClass  logger1 = NewClass .getInstance();
        NewClass  logger2 = NewClass .getInstance();

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Both logger1 and logger2 will refer to the same instance
        System.out.println(logger1 == logger2); // This will print "true"
    }
}
