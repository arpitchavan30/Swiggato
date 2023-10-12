package com.example.Swiggato.DTO.RequestDTO;

import com.example.Swiggato.Enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryPartnerRequest {
    String name;

    String mobileNo;

    Gender gender;
}
