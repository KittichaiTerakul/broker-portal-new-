package com.example.ProjectAllianz.error;

public class QuoteNotFoundException extends RuntimeException{

    public QuoteNotFoundException(int id) {
        super("Quote id not found :" +id);
    }
}
