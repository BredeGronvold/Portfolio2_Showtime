package com.example.Portfolio2_Showtime.repositories;

import com.example.Portfolio2_Showtime.models.Item;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
@AllArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final AdminRepository adminRepository;
    private final ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {
        seedItems();
        printAllItems();
    }

    private void seedItems() {

        List<Item> items = asList(new Item("HelloThere", 200, "www", "addf"),
        new Item("HelloThere", 200, "www", "addf"),
        new Item("HelloThere", 200, "www", "addf"),
        new Item("HelloThere", 200, "www", "addf"),
        new Item("HelloThere", 200, "www", "addf"),
        new Item("HelloThere", 200, "www", "addf"),
        new Item("HelloThere", 200, "www", "addf"));

        items.forEach(item -> itemRepository.save(item));
    }

    private void printAllItems() {
        itemRepository.findAll().forEach(System.out::println);
    }
}
