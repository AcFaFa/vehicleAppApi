package com.Vehiclee.New.controller;

import com.Vehiclee.New.model.User;
import com.Vehiclee.New.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/getall")
    List<User> userGetAll(){
        return userService.getAll();
    }

    @GetMapping("/user/getbyid/{id}")
    User userGetById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PostMapping("/user/add")
    User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PatchMapping("/user/update/{id}")
    User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/user/delete/{id}")
    void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
