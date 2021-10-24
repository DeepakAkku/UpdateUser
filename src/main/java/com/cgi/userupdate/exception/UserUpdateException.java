package com.cgi.userupdate.exception;

import org.springframework.core.NestedRuntimeException;

public class UserUpdateException extends NestedRuntimeException {
    private String error;
    private String errorCode;

    public UserUpdateException() {
        this("Unknown Exception");
    }

    public UserUpdateException(String error) {
        this("500", error);
    }

    public UserUpdateException(String errorCode, String error) {
        super(error);
        this.error = error;
        this.errorCode = errorCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorCode(String errorCode) {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return getError();
    }
}
