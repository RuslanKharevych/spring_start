package com.example.project.spring;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorld {
    @RequestMapping("/users")
    public static @ResponseBody List<User> helloworld(){

        return DBConnection.read();
    }

    @RequestMapping("/users/{id}")
    public static @ResponseBody User helloworldd(@PathVariable Integer id){
        return DBConnection.findByID(id);
    }
}
