package com.Vehiclee.New.service;

import com.Vehiclee.New.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    //get all
    List<User> getAll();

    //get by id
    User getById(Long id);

    //add user
    User addUser(User user);

    //update user
    User updateUser(Long id, User user);

    //deleteu user
    void deleteUser(Long id);

}
