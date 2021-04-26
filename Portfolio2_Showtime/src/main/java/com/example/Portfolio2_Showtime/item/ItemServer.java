package com.example.Portfolio2_Showtime.item;

import org.springframework.stereotype.Service;


import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ItemServer {
    private static final ArrayList<Item> savedItems = new ArrayList<>(Arrays.asList(
            new Item(setIDFirst(), "Volleyball", 5, "https://freepngimg.com/thumb/volleyball/28621-8-volleyball-free-download-thumb.png", "long description"),
            new Item(setIDFirst(), "Fotball", 5, "https://www.premierleague.com/resources/prod/e1fd15c-3351/i/nike-ball-hub/index/21.png", "long description"),
            new Item(setIDFirst(), "Basketball", 5, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/NEBL-Spalding-basket-ball.png/769px-NEBL-Spalding-basket-ball.png","long description"),
            new Item(setIDFirst(), "Hockey puck", 5, "https://pngimg.com/uploads/hockey/hockey_PNG95.png","long description"),
            new Item(setIDFirst(), "Tennisball", 5, "https://assets.stickpng.com/images/580b585b2edbce24c47b2b90.png","long description"),
            new Item(setIDFirst(), "Amerikansk fotball", 5, "https://www.pngkey.com/png/full/166-1664900_american-football-transparent-background-png-american-football-ball.png", "long description")
    ));

/*    private final String database = "jdbc:postgresql://localhost:5432/skytjenester";
    private final String username = "postgres";
    private final String password = "Pannekake7";*/


    //https://www.codejava.net/java-se/jdbc/connect-to-postgresql-database-server-via-jdbc

    public ArrayList<Item> getAllItems() throws SQLException {
        /*Connection connection = DriverManager.getConnection(database,username,password);

        String sql = "SELECT * FROM skytjenester";
        Statement statment = connection.createStatement();
        ResultSet result = statment.executeQuery(sql);

        while(result.next()){
            savedItems.add(new Item(result.getInt("ID"),
                    result.getString("Name"),
                    result.getInt("Price"),
                    result.getString("URL"),
                    result.getString("description")));
        }*/

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
        int number = (int) (Math.random() * 100000) + 100000;
        for (Item element : savedItems) {
            if (element.getId() == number) {
                setID();
            }
        }
        return number;
    }

    private static int setIDFirst() {
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

    public ArrayList<Item> deleteItem(int id) {
        for (Item element : savedItems) {
            if (element.getId() == id) {
                savedItems.remove(element);
                break;
            }
        }
        return savedItems;
    }
}
