package com.alexandreribas.lab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alexandreribas.lab.entities.User;
import com.alexandreribas.lab.repositories.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @Autowired
    private UserRepository repository;

    @GetMapping()  
    public List<User> findAll() {
       List<User> result = repository.findAll();
       return result;

    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
    
}
