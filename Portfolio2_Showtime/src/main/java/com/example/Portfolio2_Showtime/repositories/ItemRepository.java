package com.example.Portfolio2_Showtime.repositories;

import com.example.Portfolio2_Showtime.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findAll();
    Optional<Item> findById(Long id);
    Item save(Item item);
    void deleteById(Long id);
}
