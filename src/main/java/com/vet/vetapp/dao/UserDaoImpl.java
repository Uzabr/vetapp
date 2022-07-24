package com.vet.vetapp.dao;

import com.vet.vetapp.model.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager () {
        return this.entityManager;
    }

    @Override
    @Transactional
    public List<Users> getAllUsers () {
        return getEntityManager().createQuery("from Users").getResultList();
    }

    @Override
    @Transactional
    public Users getUser (Long id) {
        return getEntityManager().find(Users.class, id);
    }

    @Override
    @Transactional
    public Users getUserByName (String name) {
        return (Users) getEntityManager().createQuery("select user from Users where user.name =:name")
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    @Transactional
    public void createUser (Users user) {
        getEntityManager().persist(user);
    }

    @Override
    @Transactional
    public void updateUser (Users users) {
        getEntityManager().merge(users);
    }

    @Override
    @Transactional
    public void removeUser (Long id) {
        getEntityManager().createQuery("delete from Users user where user.id =: id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
