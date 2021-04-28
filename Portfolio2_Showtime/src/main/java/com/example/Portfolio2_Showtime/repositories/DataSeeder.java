package com.example.Portfolio2_Showtime.repositories;

import com.example.Portfolio2_Showtime.model.Item;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
@AllArgsConstructor
public class DataSeeder implements CommandLineRunner {

    final ItemRepository itemRepository;

    @Override
    public void run(String... args){
        seedItems();
    }

    private void seedItems(){

        List<Item> items = asList(new Item("Volleyball", 350, "https://freepngimg.com/thumb/volleyball/28621-8-volleyball-free-download-thumb.png", "Description"),
                new Item("Football", 600, "https://www.premierleague.com/resources/prod/e1fd15c-3351/i/nike-ball-hub/index/21.png", "Description"),
                new Item("Basketball", 400, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/NEBL-Spalding-basket-ball.png/769px-NEBL-Spalding-basket-ball.png", "Description"),
                new Item("Hockey puck", 99, "https://pngimg.com/uploads/hockey/hockey_PNG95.png", "Description"),
                new Item("Tennis ball", 35, "https://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png", "Description"),
                new Item("American football", 550, "https://www.pngkey.com/png/full/166-1664900_american-football-transparent-background-png-american-football-ball.png", "Description")
        );

        items.forEach(item -> itemRepository.save(item));
    }
}