package com.example.Swiggato.Exception;

public class MenuItemNotFoundException extends RuntimeException {
    public MenuItemNotFoundException(String message){
        super(message);
    }

}
