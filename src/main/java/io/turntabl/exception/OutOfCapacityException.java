package io.turntabl.exception;

public class OutOfCapacityException extends Exception {

    public OutOfCapacityException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
