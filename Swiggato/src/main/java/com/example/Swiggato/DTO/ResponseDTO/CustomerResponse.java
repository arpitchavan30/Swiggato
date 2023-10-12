package com.example.Swiggato.DTO.ResponseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResponse {
    String name;

    String mobileNo;

    String address;

    CartResponse cartResponse;
}
