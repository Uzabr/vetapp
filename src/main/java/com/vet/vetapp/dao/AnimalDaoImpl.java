package com.vet.vetapp.dao;

import com.vet.vetapp.model.Animals;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AnimalDaoImpl implements AnimalsDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Animals> getAllAnimal () {
        return entityManager.createQuery("from Animals").getResultList();
    }

    @Override
    @Transactional
    public void createAnimal (Animals animal) {
        entityManager.persist(animal);
    }

    @Override
    @Transactional
    public void updateAnimal (Animals animal) {
        entityManager.merge(animal);
    }

    @Override
    @Transactional
    public void removeAnimal (Long id) {
            entityManager.createQuery("delete from Animals animal where animal.id =: id").
                    setParameter("id", id)
                    .executeUpdate();
    }

    @Override
    public Animals getAnimalByBreed (String breed) {
        return (Animals) entityManager.createQuery("select animal from Animals where animal.breed =: breed")
                .setParameter("breed", breed)
                .getSingleResult();
    }
}
