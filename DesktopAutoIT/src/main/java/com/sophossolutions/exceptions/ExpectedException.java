package com.sophossolutions.exceptions;

public class ExpectedException  extends AssertionError {

    private static final long serialVersionUID = 1L;

    public ExpectedException(String message, Throwable cause) {
        super(message, cause);
    }

}
