package com.vet.vetapp.service;

import com.vet.vetapp.model.Users;

import java.util.List;

public interface UserService {

    List<Users> getAllUsers();
    void createUser(Users users);
    void updateUser(Users users);
    void removeUser(Long id);
    Users getUserByName(String name);
    Users getUser(Long id);



}
