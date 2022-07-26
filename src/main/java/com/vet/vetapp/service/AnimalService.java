package com.vet.vetapp.service;

import com.vet.vetapp.model.Animals;

import java.util.List;

public interface AnimalService {

    List<Animals> getAllAnimals();
    void createAnimal(Animals animals);
    void updateAnimal(Animals animals);
    void removeAnimal(Long id);
    Animals getAnimalByBreed(String breed);
}
