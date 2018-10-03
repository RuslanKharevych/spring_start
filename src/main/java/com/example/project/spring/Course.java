package com.example.project.spring;

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Course(int id_course, String name, String type, List<User> users) {
        this.id_course = id_course;
        this.name = name;
        this.type = type;
        this.users = users;
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
