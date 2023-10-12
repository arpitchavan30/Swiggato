package com.example.Swiggato.Utils;

import com.example.Swiggato.Models.Restaurant;
import com.example.Swiggato.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

// this class is for common checks...
@Component //this annotation will allow spring to create bean.. and now we can Autowired this bean anywhere..
public class ValidationUtils {

    final RestaurantRepository restaurantRepository;

    @Autowired
    public ValidationUtils(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    // check valid restaurant or not
    public boolean validRestaurant(int id){
        Optional<Restaurant> optionalRestaurant  = restaurantRepository.findById(id);
        if(optionalRestaurant.isEmpty()) return false;
        return true;
    }
}
