package com.example.Swiggato.Repository;

import com.example.Swiggato.Models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodItem,Integer> {
}
