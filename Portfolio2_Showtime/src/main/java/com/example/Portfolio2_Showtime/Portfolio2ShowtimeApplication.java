package com.example.Portfolio2_Showtime;

import com.example.Portfolio2_Showtime.security.ApplicationSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Portfolio2ShowtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Portfolio2ShowtimeApplication.class, args);
	}

}
