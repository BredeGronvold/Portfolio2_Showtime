package com.example.Portfolio2_Showtime.services;

import com.example.Portfolio2_Showtime.models.Item;
import com.example.Portfolio2_Showtime.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class ItemServer {
    private final ItemRepository itemRepository;

    private static final ArrayList<Item> savedItems = new ArrayList<>(Arrays.asList(
            new Item("Volleyball", 5, "https://freepngimg.com/thumb/volleyball/28621-8-volleyball-free-download-thumb.png", "long description"),
            new Item("Fotball", 5, "https://www.premierleague.com/resources/prod/e1fd15c-3351/i/nike-ball-hub/index/21.png", "long description"),
            new Item("Basketball", 5, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/NEBL-Spalding-basket-ball.png/769px-NEBL-Spalding-basket-ball.png","long description"),
            new Item("Hockey puck", 5, "https://pngimg.com/uploads/hockey/hockey_PNG95.png","long description"),
            new Item("Tennisball", 5, "https://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png","long description"),
            new Item("Amerikansk fotball", 5, "https://www.pngkey.com/png/full/166-1664900_american-football-transparent-background-png-american-football-ball.png", "long description")
    ));

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item create(final Item item) {
        return itemRepository.save(item);
    }

    public void deleteById(final Long id) {
        itemRepository.deleteById(id);
    }


}
