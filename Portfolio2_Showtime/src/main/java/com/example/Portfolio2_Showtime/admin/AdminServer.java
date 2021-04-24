package com.example.Portfolio2_Showtime.admin;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminServer {

    private ArrayList<Admin> savedAdmins = new ArrayList<>();


    public boolean logIn(Admin admin) {
        for(Admin element: savedAdmins){
            if(admin == element){
                return true;
            }
        }
        return false;
    }
}
