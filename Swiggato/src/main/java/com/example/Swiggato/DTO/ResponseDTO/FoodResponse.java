package com.example.Swiggato.DTO.ResponseDTO;

import com.example.Swiggato.Enums.FoodCategory;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodResponse {

    String dishName;

    double price;

    FoodCategory category;

    boolean veg;

    int quantityAdded;

}
