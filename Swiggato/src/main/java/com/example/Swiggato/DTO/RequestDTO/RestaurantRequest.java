package com.example.Swiggato.DTO.RequestDTO;

import com.example.Swiggato.Enums.RestarauntCategory;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantRequest {
    String name;

    String location;

    RestarauntCategory restrauntCategory;

    String contactNumber;
}
