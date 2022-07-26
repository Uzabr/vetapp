package com.vet.vetapp.service;

import com.vet.vetapp.dao.AnimalsDao;
import com.vet.vetapp.model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnimalsServiceImpl implements AnimalService{
    private AnimalsDao animalsDao;

    @Autowired
    public AnimalsServiceImpl (AnimalsDao animalsDao) {
        this.animalsDao = animalsDao;
    }

    @Override
    public List<Animals> getAllAnimals () {
        return animalsDao.getAllAnimal();
    }

    @Override
    public void createAnimal (Animals animals) {
            animalsDao.createAnimal(animals);
    }

    @Override
    public void updateAnimal (Animals animals) {
        animalsDao.updateAnimal(animals);
    }

    @Override
    public void removeAnimal (Long id) {
            animalsDao.removeAnimal(id);
    }

    @Override
    public Animals getAnimalByBreed (String breed) {
        return animalsDao.getAnimalByBreed(breed);
    }
}
