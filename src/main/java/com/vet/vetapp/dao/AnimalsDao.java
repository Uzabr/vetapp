package com.vet.vetapp.dao;

import com.vet.vetapp.model.Animals;

import java.util.List;

public interface AnimalsDao {
    List<Animals> getAllAnimal();
    void createAnimal(Animals animal);
    void updateAnimal(Animals animal);
    void removeAnimal(Long id);
    Animals getAnimalByBreed(String breed);

}
