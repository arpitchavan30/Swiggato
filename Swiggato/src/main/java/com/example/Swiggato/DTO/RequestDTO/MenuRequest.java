package com.example.Swiggato.DTO.RequestDTO;

import com.example.Swiggato.Enums.FoodCategory;
import lombok.*;
import lombok.experimental.FieldDefaults;

// saves fooditem to menu of restaurants
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuRequest {

    int restaurantId;

    String dishName;

    double price;

    FoodCategory category;

    boolean veg;

    boolean available;
}
