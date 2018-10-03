package com.example.project.spring;


import java.util.List;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
     User findById(int id);
     List<User> findAll();
}