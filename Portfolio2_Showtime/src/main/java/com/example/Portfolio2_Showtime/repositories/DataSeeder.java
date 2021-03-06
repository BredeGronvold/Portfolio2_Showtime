package com.example.Portfolio2_Showtime.repositories;

import com.example.Portfolio2_Showtime.model.Item;
import com.example.Portfolio2_Showtime.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
@AllArgsConstructor
public class DataSeeder implements CommandLineRunner {

    final ItemRepository repository;
    final ItemService itemService;

    @Override
    public void run(String... args){
        seedItems();
    }

    private void seedItems() {
        if (repository.findAll().size() == 0) {
            List<Item> items = asList(new Item("Volleyball", 350, "https://freepngimg.com/thumb/volleyball/28621-8-volleyball-free-download-thumb.png", "shortDescription", "longDescription"),
                    new Item("Football", 600, "https://www.premierleague.com/resources/prod/e1fd15c-3351/i/nike-ball-hub/index/21.png", "shortDescription", "longDescription"),
                    new Item("Basketball", 400, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/NEBL-Spalding-basket-ball.png/769px-NEBL-Spalding-basket-ball.png", "shortDescription", "longDescription"),
                    new Item("Hockey puck", 99, "https://pngimg.com/uploads/hockey/hockey_PNG95.png", "shortDescription", "longDescription"),
                    new Item("Tennis ball", 35, "https://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png", "shortDescription", "longDescription"),
                    new Item("American football", 550, "https://www.pngkey.com/png/full/166-1664900_american-football-transparent-background-png-american-football-ball.png", "shortDescription", "longDescription")
            );
            items.forEach(item -> repository.save(item));
        }
    }
}