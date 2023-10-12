package com.example.Swiggato.Transformers;

import com.example.Swiggato.DTO.RequestDTO.CustomerRequest;
import com.example.Swiggato.DTO.ResponseDTO.CartResponse;
import com.example.Swiggato.DTO.ResponseDTO.CustomerResponse;
import com.example.Swiggato.Models.Customer;

public class CustomerTransformer {
    public static Customer CustomerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .email(customerRequest.getEmail())
                .address(customerRequest.getAddress())
                .mobileNo(customerRequest.getMobileNo())
                .gender(customerRequest.getGender())
                .build();
    }

    public static CustomerResponse CustomerToCustomerResponse(Customer customer){
        // we have to prepare cart response also becoz we need to save it in customer response
        // call cart transformer
        CartResponse cartResponse = CartTransformer.CartToCartResponse(customer.getCart());
        return CustomerResponse.builder()
                .name(customer.getName())
                .mobileNo(customer.getMobileNo())
                .address(customer.getAddress())
                .cartResponse(cartResponse)
                .build();
    }
}
