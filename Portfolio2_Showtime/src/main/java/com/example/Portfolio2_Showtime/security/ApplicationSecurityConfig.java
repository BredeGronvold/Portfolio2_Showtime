
package com.example.Portfolio2_Showtime.security;

import com.example.Portfolio2_Showtime.item.ItemController;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","index","/css/*","/js/*","/home","/api/*")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable()
                .httpBasic();

    }
}

