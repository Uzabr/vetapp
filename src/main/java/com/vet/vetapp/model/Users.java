package com.vet.vetapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;


    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private List<UserPet> userPets;

    public Users (Long id, String firstName, String lastName, String login, String password, String email, List<UserPet> userPets) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.userPets = userPets;
    }
}

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities () {
//        return null;
//    }
//
//    @Override
//    public String getUsername () {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired () {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked () {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired () {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled () {
//        return false;
//    }
//}
