package com.example.Portfolio2_Showtime.admin;

import com.example.Portfolio2_Showtime.item.Item;
import com.example.Portfolio2_Showtime.item.ItemServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class AdminController {

    private final AdminServer adminServer;
    private final ItemServer itemServer;

    @Autowired
    public AdminController(AdminServer adminServer, ItemServer itemServer){
        this.adminServer=adminServer;
        this.itemServer=itemServer;
    }

    @PostMapping("/api/addItem")
    public Item addItem(@RequestBody Item item){
        return itemServer.addItem(item);
    }

    @PostMapping("/api/deleteItem")
    public ArrayList<Item> deleteItem(@RequestBody int id){
        return itemServer.deleteItem(id);
    }

    @PostMapping("/api/login")
    public boolean logIn(@RequestBody Admin admin){
        return adminServer.logIn(admin);
    }





}
