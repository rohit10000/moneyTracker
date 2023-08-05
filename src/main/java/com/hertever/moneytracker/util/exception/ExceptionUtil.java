package com.hertever.moneytracker.util.exception;

public class ExceptionUtil {
    public static void throwNotFound(String detail) throws NotFoundException {
        throw new NotFoundException(detail);
    }
}
