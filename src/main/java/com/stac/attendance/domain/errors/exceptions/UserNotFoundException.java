package com.stac.attendance.domain.errors.exceptions;

public class UserNotFoundException extends RuntimeException{
    private static final long serialVerisionUID = 1;
    public UserNotFoundException(String msg){super(msg);}
}
