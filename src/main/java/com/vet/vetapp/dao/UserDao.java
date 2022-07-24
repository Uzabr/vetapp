package com.vet.vetapp.dao;

import com.vet.vetapp.model.UserPet;
import com.vet.vetapp.model.Users;

import java.util.List;

public interface UserDao {
    List<Users> getAllUsers();
    Users getUser(Long id);
    Users getUserByName(String name);
    void createUser(Users user);
    void updateUser(Users users);
    void removeUser(Long id);

}
