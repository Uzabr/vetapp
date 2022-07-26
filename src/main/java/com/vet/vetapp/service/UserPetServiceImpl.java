package com.vet.vetapp.service;

import com.vet.vetapp.dao.UserPetDao;
import com.vet.vetapp.model.UserPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserPetServiceImpl implements UserPetService{

    private UserPetDao userPetDao;

    @Autowired
    public UserPetServiceImpl (UserPetDao userPetDao) {
        this.userPetDao = userPetDao;
    }

    @Override
    public List<UserPet> getAllPets () {
        return userPetDao.getAllPets();
    }

    @Override
    public void createPet (UserPet pet) {
        userPetDao.createPet(pet);
    }

    @Override
    public void updatePet (UserPet pet) {
        userPetDao.updatePet(pet);
    }

    @Override
    public UserPet getByNickName (String name) {
        return userPetDao.getPetByNickname(name);
    }

    @Override
    public void removePet (Long id) {
        userPetDao.removePet(id);
    }
}
