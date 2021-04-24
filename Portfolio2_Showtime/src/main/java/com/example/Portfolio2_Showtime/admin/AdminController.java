package com.example.Portfolio2_Showtime.admin;

import com.example.Portfolio2_Showtime.item.Item;
import com.example.Portfolio2_Showtime.item.ItemServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {

    private final ItemServer itemServer;
    private final AdminServer adminServer;

    @Autowired
    public AdminController(ItemServer itemServer, AdminServer adminServer){
        this.itemServer=itemServer;
        this.adminServer=adminServer;
    }

    @PostMapping("/api/addItem")
    public Item addItem(@RequestBody Item item){
        return itemServer.addItem(item);
    }

    @PostMapping("/api/login")
    public boolean logIn(@RequestBody Admin admin){
        return adminServer.logIn(admin);
    }





}
