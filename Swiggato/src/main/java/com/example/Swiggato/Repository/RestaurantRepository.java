package com.example.Swiggato.Repository;

import com.example.Swiggato.Models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {

}
