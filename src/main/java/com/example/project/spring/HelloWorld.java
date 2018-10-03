package com.example.project.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorld {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public @ResponseBody List<User> users(){
        return userRepository.findAll();
    }

    @RequestMapping("/users/{id}")
    public @ResponseBody User usersId(@PathVariable int id){
        return userRepository.findById(id);
    }
}
