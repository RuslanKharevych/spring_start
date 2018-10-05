package com.example.project.spring.repositories;


import java.util.List;

import com.example.project.spring.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
     User findById(int id);
     List<User> findAll();
}