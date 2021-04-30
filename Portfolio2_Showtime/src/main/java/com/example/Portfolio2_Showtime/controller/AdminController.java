package com.example.Portfolio2_Showtime.controller;

import com.example.Portfolio2_Showtime.model.Admin;
import com.example.Portfolio2_Showtime.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/api/login")
    public boolean logIn(@RequestBody Admin admin) {
        return adminService.logIn(admin);
    }


}
