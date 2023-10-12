package com.example.Swiggato.DTO.ResponseDTO;

import com.example.Swiggato.Models.MenuItem;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantResponse {
    String name;

    String contactNumber;

    String location;

    boolean opened;

    List<MenuResponse> menu;
}
