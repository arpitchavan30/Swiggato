package com.example.Swiggato.Transformers;

import com.example.Swiggato.DTO.ResponseDTO.FoodResponse;
import com.example.Swiggato.Models.FoodItem;

public class FoodIteamTransformer {

    public static FoodResponse FoodIteamToFoodResponse(FoodItem food){
        return FoodResponse.builder()
                .dishName(food.getMenuItem().getDishName())
                .price(food.getMenuItem().getPrice())
                .category(food.getMenuItem().getCategory())
                .veg(food.getMenuItem().isVeg())
                .quantityAdded(food.getRequiredQuantity())
                .build();
    }
}
