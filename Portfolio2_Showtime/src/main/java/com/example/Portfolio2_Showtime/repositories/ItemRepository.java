package com.example.Portfolio2_Showtime.repositories;


import com.example.Portfolio2_Showtime.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByName(String name);
}
