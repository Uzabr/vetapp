package com.vet.vetapp.dao;

import com.vet.vetapp.model.UserPet;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserPetDaoImpl implements UserPetDao{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<UserPet> getAllPets () {
        return entityManager.createQuery("from UsersPet").getResultList();
    }

    @Override
    @Transactional
    public void createPet (UserPet pet) {
        entityManager.persist(pet);
    }

    @Override
    @Transactional
    public void updatePet (UserPet pet) {
        entityManager.merge(pet);
    }

    @Override
    @Transactional
    public UserPet getPetByNickname (String nickname) {
        return (UserPet) entityManager.createQuery("select pet from UserPet where user.nickname =: nickname")
                .setParameter("nickname", nickname)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void removePet (Long id) {
        entityManager.createQuery("delete from UserPet pet where pet.id =: id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
