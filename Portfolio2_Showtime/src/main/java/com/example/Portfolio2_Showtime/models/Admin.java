package com.example.Portfolio2_Showtime.models;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@NoArgsConstructor
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    public Admin(final String username, final String password) {
        this.username = username;
        this.password = password;
    }
}
