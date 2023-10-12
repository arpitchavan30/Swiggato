package com.example.Swiggato.Exception;

public class RestaurantNotOpendException extends RuntimeException{
    public RestaurantNotOpendException(String message){
        super(message);
    }
}
