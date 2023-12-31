package com.example.Swiggato.DTO.RequestDTO;

import com.example.Swiggato.Enums.FoodCategory;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodRequest {

    int requiredQuantity;

    String customerMobile;

    int menuItemId;  // user will give menuItem Id only , we will figure out from which restaurant he is ordering...

}
