package com.example.Portfolio2_Showtime.item;

import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ItemServer {
    private static ArrayList<Item> savedItems = new ArrayList(Arrays.asList(
            new Item(0,"Item0",4.20,"long description","short description"),
            new Item(1,"Item1",4.20,"long description","short description"),
            new Item(2,"Item2",4.20,"long description","short description"),
            new Item(3,"Item3",4.20,"long description","short description"),
            new Item(4,"Item4",4.20,"long description","short description")
    ));

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
        String[] list = new String[savedItems.size()];
        for (int i = 0; i < savedItems.size(); i++) {
            list[i] = savedItems.get(i).getName();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1 + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j])>0) {
                    String bytt = list[i];
                    list[i] = list[j];
                    list[j] = bytt;
                }
            }


        }
    }
}
