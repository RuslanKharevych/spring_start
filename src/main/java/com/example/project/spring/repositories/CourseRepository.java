package com.example.project.spring.repositories;

import java.util.List;

import com.example.project.spring.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    Course findById(int id);
    List<Course> findAll();
}