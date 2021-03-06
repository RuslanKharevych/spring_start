package com.example.project.spring.controllers;


import com.example.project.spring.repositories.CourseRepository;
import com.example.project.spring.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping("/courses")
    public @ResponseBody List<Course> courses(){
        return courseRepository.findAll();
    }

    @RequestMapping("/courses/{id}")
    public @ResponseBody Course coursesId(@PathVariable int id){
        return courseRepository.findById(id);
    }
}
