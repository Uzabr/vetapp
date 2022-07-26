package com.vet.vetapp.service;

import com.vet.vetapp.dao.UserDao;
import com.vet.vetapp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Autowired
    public UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Users> getAllUsers () {
        return userDao.getAllUsers();
    }

    @Override
    public void createUser (Users users) {
        userDao.createUser(users);
    }

    @Override
    public void updateUser (Users users) {
        userDao.updateUser(users);
    }

    @Override
    public void removeUser (Long id) {
            userDao.removeUser(id);
    }

    @Override
    public Users getUserByName (String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public Users getUser (Long id) {
        return userDao.getUser(id);
    }
}
