package com.example.Swiggato.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data // gives setter, getter, and required arg constructor
// @Data :- also gives required arg constructor but we have to still initalize the noarga and all args constructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    double cartTotal;

    @OneToOne
    @JoinColumn
    Customer customer;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    List<FoodItem> foodItems = new ArrayList<>();
}
