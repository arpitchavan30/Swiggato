package com.example.Swiggato.Exception;

public class EmptyCartException extends RuntimeException{
    public EmptyCartException(String message){
        super(message);
    }
}
