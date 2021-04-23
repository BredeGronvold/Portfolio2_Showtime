package com.example.Portfolio2_Showtime.item;

import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;

@Service
public class ItemServer {
    private static final ArrayList<Item> savedItems = new ArrayList<>();

    public ArrayList<Item> getAllItems() {
        return savedItems;
    }

    public Item getItem(int item_id) {
        for (Item item : savedItems) {
            if (item.getId() == item_id) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getItemsByName(String item_name) {
        ArrayList<Item> itemNames = new ArrayList<>();
        for (Item item : savedItems) {
            if (item.getName().contains(item_name)) {
                itemNames.add(item);
            }
        }
        return itemNames;
    }

    public Item getItemByPic(URL item_url) {
        for (Item item : savedItems) {
            if (item.getPicture().equals(item_url)) {
                return item;
            }
        }
        return null;
    }

    public Item addItem(Item item) {
        item.setId(setID());
        savedItems.add(item);
        return item;
    }

    private int setID() {
        return (int) (Math.random() * 100000) + 100000;
    }
}
