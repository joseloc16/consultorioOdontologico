package com.todocode.consultorioodontologico.exceptions;

public class NonexistentEntityException extends Throwable {
    public NonexistentEntityException(String message) {
        super(message);
    }

    public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }
}
