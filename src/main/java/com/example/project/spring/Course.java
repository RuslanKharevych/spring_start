package com.example.project.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Course")
public class Course {
    @Id
    private int id_course;
    private String name;
    private String type;

    @ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
    private List<User> users = new ArrayList<>();

    public Course() {
    }

    public Course(int id_group, String name, String type) {
        this.id_course = id_group;
        this.name = name;
        this.type = type;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
