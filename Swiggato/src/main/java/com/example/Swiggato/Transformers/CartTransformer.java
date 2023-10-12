package com.example.Swiggato.Transformers;

import com.example.Swiggato.DTO.ResponseDTO.CartResponse;
import com.example.Swiggato.DTO.ResponseDTO.CartStatusResponse;
import com.example.Swiggato.Models.Cart;

import java.util.ArrayList;

public class CartTransformer {

    public static CartResponse CartToCartResponse(Cart cart){
        return CartResponse.builder()
                .cartTotal(cart.getCartTotal())
                .foodItems(new ArrayList<>())
                .build();
    }

    public static CartStatusResponse CartToCartStatusResponse(Cart savedCart){
        return CartStatusResponse.builder()
                .customerName(savedCart.getCustomer().getName())
                .customerMobile(savedCart.getCustomer().getMobileNo())
                .customerAddress(savedCart.getCustomer().getAddress())

                .build();
    }
}
