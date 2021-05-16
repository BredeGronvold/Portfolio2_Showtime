/*
package com.example.Portfolio2_Showtime.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/home","/api/**", "/api/*").permitAll()
                //.antMatchers("/api/*","/api/**").hasRole(ApplicationUserRole.ADMIN.name())
                .anyRequest()
                .authenticated()
                .and()
                .addFilterBefore(new CORSFilter(), ChannelProcessingFilter.class)
                .csrf().disable()
                .httpBasic();

    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService(){
        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("passord"))
                .roles(ApplicationUserRole.ADMIN.name())
                .build();

        return new InMemoryUserDetailsManager(admin);
    }
}


*/
