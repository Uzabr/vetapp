package com.vet.vetapp.service;

import com.vet.vetapp.dao.UserPetDaoImpl;
import com.vet.vetapp.model.UserPet;

import java.util.List;

public interface UserPetService {

    List<UserPet> getAllPets();
    void createPet(UserPet pet);
    void updatePet(UserPet pet);
    UserPet getByNickName(String name);
    void removePet(Long id);

}
