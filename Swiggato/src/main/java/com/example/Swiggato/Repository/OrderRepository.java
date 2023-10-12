package com.example.Swiggato.Repository;

import com.example.Swiggato.Models.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

}
