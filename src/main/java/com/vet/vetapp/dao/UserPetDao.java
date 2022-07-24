package com.vet.vetapp.dao;

import com.vet.vetapp.model.UserPet;

import java.util.List;

public interface UserPetDao {
    List<UserPet> getAllPets();
    void createPet(UserPet pet);
    void updatePet(UserPet pet);
    UserPet getPetByNickname(String nickname);
    void removePet(Long id);
}
