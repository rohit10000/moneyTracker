package com.hertever.moneytracker.util.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class NotFoundException extends Exception{
    public NotFoundException(String message) {
        super(message);
    }
}
