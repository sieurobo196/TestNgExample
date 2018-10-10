package com.codewr.user;

public class UserUpdateException extends Exception {

    private static final long serialVersionUID = 1L;

    public UserUpdateException() {
    }

    public UserUpdateException(String message) {
        super(message);
        System.out.println(message);
    }

}
