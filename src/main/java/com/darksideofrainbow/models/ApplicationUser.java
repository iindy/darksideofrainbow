package com.darksideofrainbow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_user_id_seq")
    @SequenceGenerator(name = "application_user_id_seq", sequenceName = "application_user_id_seq", allocationSize = 100)
    private Long id;

    private String username;
    private String password;
    private Boolean isAdmin;

    public ApplicationUser(String username, String password, Boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }
}
