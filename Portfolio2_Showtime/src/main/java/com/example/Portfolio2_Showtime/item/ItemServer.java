package com.example.Portfolio2_Showtime.item;

import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;

@Service
public class ItemServer {
    private static ArrayList<Item> savedItems = new ArrayList();

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

    public ArrayList<Item> sortedItems(String sortBy) {
        if (sortBy.equals("Name")) sortByName();

        return savedItems;
    }

    public void sortByName() {
        for (int i = 0; i < savedItems.size(); i++) {
            for (int j = savedItems.size() - 1; j >= 0; j++) {
                if (savedItems.get(i).getName().compareTo(savedItems.get(j).getName()) > 0) {
                    Item item = savedItems.get(i);
                    int index = savedItems.indexOf(savedItems.get(j));
                    savedItems.add(savedItems.indexOf(savedItems.get(i)), savedItems.get(j));
                    savedItems.add(index, item);
                }
            }
        }
    }
}
