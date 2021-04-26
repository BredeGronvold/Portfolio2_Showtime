package com.example.Portfolio2_Showtime.services;

import com.example.Portfolio2_Showtime.models.Admin;
import com.example.Portfolio2_Showtime.repositories.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Service
@AllArgsConstructor
public class AdminServer {

    private final AdminRepository adminRepository;

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public boolean logIn(Admin admin) {
        final List<Admin> savedAdmins = adminRepository.findAll();
        for(Admin element: savedAdmins){
            if(admin == element){
                return true;
            }
        }
        return false;
    }

}
