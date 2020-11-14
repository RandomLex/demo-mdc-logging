package com.barzykin.logging.mdc.demo.exceptions;

public class ApplicationException extends RuntimeException {

    public ApplicationException(String s) {
        super(s);
    }
}
