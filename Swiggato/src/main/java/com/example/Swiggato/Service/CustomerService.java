package com.example.Swiggato.Service;

import com.example.Swiggato.DTO.RequestDTO.CustomerRequest;
import com.example.Swiggato.DTO.ResponseDTO.CustomerResponse;
import com.example.Swiggato.Exception.CustomerNotFoundException;
import com.example.Swiggato.Models.Cart;
import com.example.Swiggato.Models.Customer;
import com.example.Swiggato.Repository.CustomerRepository;
import com.example.Swiggato.Transformers.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        // DTO--> model
        Customer customer = CustomerTransformer.CustomerRequestToCustomer(customerRequest);

        // allcoacte the cart to registered customer
        // create cart
        Cart cart  = Cart.builder()
                .cartTotal(0)
                .customer(customer)
                .build();
        // set cart to customer
        customer.setCart(cart);
        // save both, :- save parent customer it will save child cart also
        Customer savedCustomer = customerRepository.save(customer);

        //prepare response dto
        CustomerResponse customerResponse  = CustomerTransformer.CustomerToCustomerResponse(savedCustomer);
        return  customerResponse;

    }

    public CustomerResponse getCustomerByMob(String mobile) {
        // find by mob
        Customer customer = customerRepository.findByMobileNo(mobile);
        if(customer==null){
            throw new CustomerNotFoundException("Invalid mobile no !!!!");
        }
        // model to dto
        return CustomerTransformer.CustomerToCustomerResponse(customer);

    }
}
