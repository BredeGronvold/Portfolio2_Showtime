package com.example.Portfolio2_Showtime.item;

import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ItemServer {
    private static final ArrayList<Item> savedItems = new ArrayList<>(Arrays.asList(
            new Item(setID(), "Tennisball", 5,picURL("http://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png"),"short description","long description"),
            new Item(setID(), "Fotball", 5,picURL("https://www.vhv.rs/dpng/d/39-396773_uefa-champions-league-ball-png-transparent-png.png"),"short description","long description"),
            new Item(setID(), "Basketball", 5,picURL("https://toppng.com/uploads/preview/basketball-ball-115470314151an4nwabq0.png"),"short description","long description"),
            new Item(setID(), "Golfball", 5,picURL("https://banner2.cleanpng.com/20180308/etw/kisspng-golf-ball-tee-football-golf-ball-png-clipart-5aa1fcf7c322e6.9936992215205654957993.jpg"),"short description","long description"),
            new Item(setID(), "Amerikansk fotball", 5,picURL("http://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png"),"short description","long description"),
            new Item(setID(), "Badeball", 5,picURL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREu_Yu5cP8AXfZfUg0pXASx2Rg9eK1B4N4UQ&usqp=CAU"),"short description","long description")
    ));

    public static URL picURL(String string){
        try {
            return new URL(string);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

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

    private static int setID() {
        return (int) (Math.random() * 100000) + 100000;
    }
}
