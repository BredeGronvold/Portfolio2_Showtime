package com.example.Portfolio2_Showtime.controller;

import com.example.Portfolio2_Showtime.admin.Admin;
import com.example.Portfolio2_Showtime.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @PostMapping("/api/login")
    public boolean logIn(@RequestBody Admin admin) {
        return adminService.logIn(admin);
    }


}
