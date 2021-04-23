package com.example.Portfolio2_Showtime.item;

import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ItemServer {
    private static final ArrayList<Item> savedItems = new ArrayList<>(Arrays.asList(
            new Item(setID(), "Tennisball", 5, "http://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png", "short description", "long description"),
            new Item(setID(), "Fotball", 5, "https://www.vhv.rs/dpng/d/39-396773_uefa-champions-league-ball-png-transparent-png.png", "short description", "long description"),
            new Item(setID(), "Basketball", 5, "https://toppng.com/uploads/preview/basketball-ball-115470314151an4nwabq0.png", "short description", "long description"),
            new Item(setID(), "Golfball", 5, "https://banner2.cleanpng.com/20180308/etw/kisspng-golf-ball-tee-football-golf-ball-png-clipart-5aa1fcf7c322e6.9936992215205654957993.jpg", "short description", "long description"),
            new Item(setID(), "Amerikansk fotball", 5, "https://p.kindpng.com/picc/s/726-7265704_american-football-png-image-wilson-football-transparent-png.png", "short description", "long description"),
            new Item(setID(), "Badeball", 5, "https://e1.pngegg.com/pngimages/919/351/png-clipart-multicolored-beach-ball-thumbnail.png", "short description", "long description")
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

    public Item getItemByPic(String item_url) {
        for (Item item : savedItems)
            if (item.getPictureURL().equals(item_url)) {
                return item;
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

    public Item setPic(int item_id, String url) {
        for (Item item : savedItems) {
            if (item.getId() == item_id) {
                item.setPictureURL(removeQuot(url));
                return item;
            }
        }
        return null;
    }

    public String removeQuot(String string) {
        return string.replace("\"", "");
    }

}
