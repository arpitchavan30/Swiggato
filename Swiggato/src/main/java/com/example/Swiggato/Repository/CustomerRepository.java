package com.example.Swiggato.Repository;

import com.example.Swiggato.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    // find customer by mobile no
    public Customer findByMobileNo(String mobile);

}
