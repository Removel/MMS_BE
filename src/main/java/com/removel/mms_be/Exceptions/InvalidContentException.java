package com.removel.mms_be.Exceptions;

public class InvalidContentException extends RuntimeException {
    public InvalidContentException(String message) {
        super(message);
    }
}
