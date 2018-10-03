package com.example.project.spring;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
    private List<User> users = new ArrayList<>();

}