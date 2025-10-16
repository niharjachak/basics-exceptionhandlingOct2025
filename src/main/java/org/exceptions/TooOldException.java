package org.exceptions;

public class TooOldException extends RuntimeException{
    public TooOldException() {
    }

    public TooOldException(String message) {
        super(message);
    }
}
