package com.example.Swiggato.Transformers;

import com.example.Swiggato.DTO.RequestDTO.RestaurantRequest;
import com.example.Swiggato.DTO.ResponseDTO.MenuResponse;
import com.example.Swiggato.DTO.ResponseDTO.RestaurantResponse;
import com.example.Swiggato.Models.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantTransformer {
    public static Restaurant RestaurantRequestToRestaurant(RestaurantRequest restaurantRequest){
        return Restaurant.builder()
                .name(restaurantRequest.getName())
                .contactNumber(restaurantRequest.getContactNumber())
                .location(restaurantRequest.getLocation())
                .restrauntCategory(restaurantRequest.getRestrauntCategory())
                .opened(true)
                .availableMenuItems(new ArrayList<>())
                .orders(new ArrayList<>())
                .build();
    }

    public static RestaurantResponse RestaurantToRestaurantResponse(Restaurant restaurant){

    // we have to convert each foodItem to response, so we have just use stream APIs instead of "for" loop
        List<MenuResponse> menu = restaurant.getAvailableMenuItems()
                .stream()
                .map(foodItem -> MenuItemTransformer.MenuItemToMenuResponse(foodItem))
                .collect(Collectors.toList());
        // we have to set this menu to restaurantResponse:- ie list of foodItems

        return RestaurantResponse.builder()
                .name(restaurant.getName())
                .contactNumber(restaurant.getContactNumber())
                .location(restaurant.getLocation())
                .opened(restaurant.isOpened())
                .menu(menu)
                .build();
    }
}
