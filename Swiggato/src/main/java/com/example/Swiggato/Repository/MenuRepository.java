package com.example.Swiggato.Repository;

import com.example.Swiggato.Models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface MenuRepository extends JpaRepository<MenuItem,Integer> {
}
