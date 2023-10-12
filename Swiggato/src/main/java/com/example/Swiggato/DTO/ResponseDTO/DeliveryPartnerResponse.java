package com.example.Swiggato.DTO.ResponseDTO;

import com.example.Swiggato.Enums.Gender;
import com.example.Swiggato.Models.OrderEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DeliveryPartnerResponse {


    int id;

    String name;

    String mobileNo;

    Gender gender;

    int TotalNoOfOrders;
}
