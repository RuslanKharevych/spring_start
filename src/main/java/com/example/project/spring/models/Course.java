package com.example.project.spring.models;


import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="Course")
public class Course {
    @Id
    private int id_course;
    private String name;
    private String type;

    @ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
    private List<User> users = new ArrayList<>();

}