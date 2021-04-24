package com.example.Portfolio2_Showtime.admin;

import com.example.Portfolio2_Showtime.item.Item;

public class Admin {

    private String username;
    private String password;
    private Item itemsMade;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Item getItemsMade() {
        return itemsMade;
    }

    public void setItemsMade(Item itemsMade) {
        this.itemsMade = itemsMade;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", itemsMade=" + itemsMade +
                '}';
    }
}
