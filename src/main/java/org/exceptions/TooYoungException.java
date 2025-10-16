package org.exceptions;

public class TooYoungException  extends RuntimeException{
    public TooYoungException() {
    }

    public TooYoungException(String message) {
        super(message);
    }
}
